package org.example.tpbiodiversite.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tpbiodiversite.dto.ObservationResponseDto;
import org.example.tpbiodiversite.dto.TravelResponseDto;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Observation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long observation_id;

    @ManyToOne
    @JoinColumn(name = "specie_id")
    private Specie specie;

    private String observerName;
    private String location;
    private double latitude;
    private double longitude;
    private LocalDate observationDate;
    private String comment;

    public ObservationResponseDto entityToDto () {
        return ObservationResponseDto.builder()
                .observation_id(observation_id)
                .specie(specie.getCommonName() + " " + specie.getScientificName())
                .observerName(observerName)
                .location(location)
                .latitude(latitude)
                .longitude(longitude)
                .observationDate(observationDate.toString())
                .comment(comment)
                .build();
    }
}
