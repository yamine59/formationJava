package org.example.tpbiodiversite.service;

import org.example.tpbiodiversite.dto.observation.ObservationReceiveDto;
import org.example.tpbiodiversite.dto.observation.ObservationResponseDto;
import org.example.tpbiodiversite.entity.Observation;
import org.example.tpbiodiversite.entity.Specie;
import org.example.tpbiodiversite.execption.NotFoundException;
import org.example.tpbiodiversite.repository.ObservationRepo;
import org.example.tpbiodiversite.repository.SpecieRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObservationService {
    private final ObservationRepo observationRepo;
    private final SpecieRepo specieRepo;

    public ObservationService(ObservationRepo observationRepo, SpecieRepo specieRepo) {
        this.observationRepo = observationRepo;
        this.specieRepo = specieRepo;
    }

    public ObservationResponseDto save(ObservationReceiveDto observation) {
        Specie specie = specieRepo.findById(observation.getSpecie_id()).orElseThrow(NotFoundException::new);
        return observationRepo.save(observation.dtoToEntity(specie)).entityToDto();
    }

    public ObservationResponseDto update(long id, ObservationReceiveDto observationReceiveDto) {
        Observation ObToUpdate = observationRepo.findById(id).orElse(null);
        Specie specie = specieRepo.findById(observationReceiveDto.getSpecie_id()).orElseThrow(NotFoundException::new);

        Observation observationGet = observationReceiveDto.dtoToEntity(specie);

        ObToUpdate.setSpecie(observationGet.getSpecie());
        ObToUpdate.setObserverName(observationGet.getObserverName());
        ObToUpdate.setLocation(observationGet.getLocation());
        ObToUpdate.setLatitude(observationGet.getLatitude());
        ObToUpdate.setLongitude(observationGet.getLongitude());
        ObToUpdate.setObservationDate(observationGet.getObservationDate());
        ObToUpdate.setComment(observationGet.getComment());

        return observationRepo.save(ObToUpdate).entityToDto();
    }

    public void delete(long id) {
       observationRepo.deleteById(id);
    }

    public ObservationResponseDto findById(long id) {
        return observationRepo.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }

    public List<ObservationResponseDto> findAll() {
        return observationRepo.findAll().stream().map(Observation::entityToDto).toList();
    }

    public List<ObservationResponseDto> findBySpecieId(long id) {
        Specie specie = specieRepo.findById(id).orElseThrow(NotFoundException::new);
        return observationRepo.findBySpecie(specie).stream().map(Observation::entityToDto).toList();
    }

    public List<ObservationResponseDto> findByLocation(String location) {
        return observationRepo.findByLocation(location).stream().map(Observation::entityToDto).toList();
    }

}
