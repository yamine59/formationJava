package org.example.tpbiodiversite.dto;

import lombok.Data;
import org.example.tpbiodiversite.ENUM.Category;
import org.example.tpbiodiversite.entity.Specie;

@Data
public class SpecieReceiveDto {
    private long specie_id;
    private String commonName;
    private String scientificName;
    private String category;

    public Specie dtoToEntity() {

        category = category.toUpperCase();
        return Specie.builder()
                .specie_id(specie_id)
                .commonName(commonName)
                .scientificName(scientificName)
                .category(Category.valueOf(category)).build();

    }
}
