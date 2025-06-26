package org.example.tpbiodiversite.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SpecieResponseDto {
    private long specie_id;
    private String commonName;
    private String scientificName;
    private String category;
}
