package org.example.tpbiodiversite.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tpbiodiversite.ENUM.Category;
import org.example.tpbiodiversite.dto.specie.SpecieResponseDto;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Specie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long specie_id;
    private String commonName;
    private String scientificName;
    private Category category;

    public SpecieResponseDto entityToDto (){
        return SpecieResponseDto.builder()
                .specie_id(specie_id)
                .commonName(commonName)
                .scientificName(scientificName)
                .category(String.valueOf(category))
                .build();

    }
}
