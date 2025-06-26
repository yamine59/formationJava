package org.example.tpbiodiversite.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;



@Data
@Builder
public class TravelResponsesStatDto {
    private double totalDistanceKm;
    private double totalEmissionKg;
    private Map<String, Double> byMode;

    public TravelResponsesStatDto(double totalDistanceKm, double totalEmissionKg,Map<String, Double> byMode) {
        this.totalDistanceKm = totalDistanceKm;
        this.totalEmissionKg = totalEmissionKg;
        this.byMode = byMode;
    }
}
