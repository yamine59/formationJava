package org.example.tpbiodiversite.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder


@Data
public class ObservationResponseDto {
    private Long observation_id;
    private String specie;
    private String observerName;
    private String location;
    private double latitude;
    private double longitude;
    private String observationDate;
    private String comment;
}
