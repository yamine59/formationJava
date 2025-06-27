package org.example.tpbiodiversite.dto.specie;

import lombok.Data;
import org.example.tpbiodiversite.ENUM.Category;
import org.example.tpbiodiversite.entity.Specie;

@Data
public class SpecieReceiveDto {
    private String commonName;
    private String scientificName;
    private String category;

    public Specie dtoToEntity() {

        category = category.toUpperCase();
        return Specie.builder()
                .commonName(commonName)
                .scientificName(scientificName)
                .category(Category.valueOf(category)).build();

    }
}
