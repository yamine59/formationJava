package org.example.tpbiodiversite.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TravelResponseDto {
    private long travel_id;
    private String observation;
    private double distanceKm;
    private String mode;
    private double estimatedCo2Kg;

}
