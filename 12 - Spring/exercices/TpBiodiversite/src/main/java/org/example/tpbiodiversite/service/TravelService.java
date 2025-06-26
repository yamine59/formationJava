package org.example.tpbiodiversite.service;

import org.example.tpbiodiversite.dto.*;
import org.example.tpbiodiversite.entity.Observation;
import org.example.tpbiodiversite.entity.Specie;
import org.example.tpbiodiversite.entity.TravelLog;
import org.example.tpbiodiversite.execption.NotFoundException;
import org.example.tpbiodiversite.repository.ObservationRepo;
import org.example.tpbiodiversite.repository.TravelRepo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TravelService {
    private final TravelRepo travelRepo;
    private final ObservationRepo observationRepo;

    public TravelService(TravelRepo travelRepo, ObservationRepo observationRepo) {
        this.travelRepo = travelRepo;
        this.observationRepo = observationRepo;
    }

    public TravelResponseDto save(TravelReceiveDto travelReceiveDto) {
        Observation observation = observationRepo.findById(travelReceiveDto.getObservation_id()).orElseThrow(NotFoundException::new);
        TravelLog existingTravel = travelReceiveDto.dtoToEntity(observation);
        TravelLog Travel = CalculateCo2(existingTravel);
        return travelRepo.save(Travel).entityToDto();
    }

    public TravelResponseDto update(long travelId, TravelReceiveDto travelReceiveDto) {
        TravelLog existingTravel = travelRepo.findById(travelId).orElseThrow(NotFoundException::new);
        Observation observation = observationRepo.findById(travelReceiveDto.getObservation_id()).orElseThrow(NotFoundException::new);

        TravelLog updatedTravel = travelReceiveDto.dtoToEntity(observation);

        existingTravel.setDistanceKm(updatedTravel.getDistanceKm());
        existingTravel.setMode(updatedTravel.getMode());
        existingTravel.setObservation(observation);

        TravelLog Travel = CalculateCo2(existingTravel);
        return travelRepo.save(Travel).entityToDto();
    }

    public TravelResponseDto findById(long id) {
        return travelRepo.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }

    public TravelResponseTotalDto findAll() {
        double totalCo2 = 0.0;
        for (TravelLog travelLog : travelRepo.findAll()) {
            totalCo2 += travelLog.getEstimatedCo2Kg();
        }
        totalCo2 = round(totalCo2);
        List<TravelResponseDto> TotalTravelResponseDto = travelRepo.findAll().stream().map(TravelLog::entityToDto).toList();
        for (TravelResponseDto travelResponseDto1 : TotalTravelResponseDto) {
            travelResponseDto1.setEstimatedCo2Kg(round(travelResponseDto1.getEstimatedCo2Kg()));
        }
        return new TravelResponseTotalDto(TotalTravelResponseDto, totalCo2);
    }

    public TravelResponsesStatDto stat(long id_observation) {
        double totalCo2 = 0.0;
        double totalKm = 0.0;
        Map<String, Double> byMode = new HashMap<>();
        Observation observation = observationRepo.findById(id_observation).orElseThrow(NotFoundException::new);
        List<TravelLog> findByObservation = travelRepo.findByObservation(observation);

        for (TravelLog travelLog : findByObservation) {
            totalCo2 += travelLog.getEstimatedCo2Kg();
            totalKm += travelLog.getDistanceKm();
           if (byMode.containsKey(travelLog.getMode().toString())) {
                byMode.put(travelLog.getMode().toString(), byMode.get(travelLog.getMode().toString()) + round(travelLog.getEstimatedCo2Kg()));
            } else {
                byMode.put(travelLog.getMode().toString(), round(travelLog.getEstimatedCo2Kg()));
            }
        }
        totalCo2 = round(totalCo2);
        return new TravelResponsesStatDto(totalKm, totalCo2, byMode);
    }

    public List<TravelResponseDto> findByObserverName(String observerName) {
       Observation observation = observationRepo.findByObserverName(observerName);
       List<TravelLog> findByObservation = travelRepo.findByObservation(observation);
       return findByObservation.stream().map(TravelLog::entityToDto).toList();
    }

    public void delete(long id) {
        travelRepo.deleteById(id);
    }

    public TravelLog CalculateCo2(TravelLog travelLog) {
        double distanceKm = travelLog.getDistanceKm();
        switch (travelLog.getMode()) {
            case CAR:
                travelLog.setEstimatedCo2Kg(distanceKm * 0.22);
                break;
            case BUS:
                travelLog.setEstimatedCo2Kg(distanceKm * 0.11);
                break;
            case TRAIN:
                travelLog.setEstimatedCo2Kg(distanceKm * 0.03);
                break;
            case PLANE:
                travelLog.setEstimatedCo2Kg(distanceKm * 0.259);
                break;
            default:
                travelLog.setEstimatedCo2Kg(0.0);
        }
        travelLog.setEstimatedCo2Kg(Math.round(travelLog.getEstimatedCo2Kg() * 100.0) / 100.0);
        return travelLog;
    }

    public double round(double value){
        return Math.round(value * 100.0) / 100.0;
    }

}



