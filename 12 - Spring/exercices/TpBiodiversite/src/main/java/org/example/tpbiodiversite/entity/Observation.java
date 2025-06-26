package org.example.tpbiodiversite.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tpbiodiversite.dto.ObservationResponseDto;

import java.time.LocalDate;

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
