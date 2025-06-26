package org.example.tpbiodiversite.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tpbiodiversite.ENUM.TravelMode;
import org.example.tpbiodiversite.entity.Observation;

@Builder
@Data
public class TravelResponseDto {
    private long travel_id;
    private String observation;
    private double distanceKm;
    private String mode;
    private double estimatedCo2Kg;

}
