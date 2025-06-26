package org.example.tpbiodiversite.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



@Builder
@Data
public class TravelResponseTotalDto {
    private List<TravelResponseDto> travels;
    private double totalCo2Kg;

    public TravelResponseTotalDto(List<TravelResponseDto> travels, double totalCo2Kg) {
        this.travels = travels;
        this.totalCo2Kg = totalCo2Kg;
    }
}
