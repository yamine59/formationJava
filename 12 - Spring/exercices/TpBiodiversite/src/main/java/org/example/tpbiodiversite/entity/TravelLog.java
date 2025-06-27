package org.example.tpbiodiversite.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tpbiodiversite.ENUM.TravelMode;
import org.example.tpbiodiversite.dto.travellog.TravelResponseDto;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TravelLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long travel_id;
    @ManyToOne
    @JoinColumn(name = "observation_id")
    private Observation observation;
    private double distanceKm;
    private TravelMode mode;
    private double estimatedCo2Kg;

    public TravelResponseDto entityToDto (){
        return TravelResponseDto.builder()
                .travel_id(travel_id)
                .distanceKm(distanceKm)
                .mode(String.valueOf(mode))
                .estimatedCo2Kg(estimatedCo2Kg)
                .observation(observation.entityToDto().getObserverName())
                .build();
    }


}
