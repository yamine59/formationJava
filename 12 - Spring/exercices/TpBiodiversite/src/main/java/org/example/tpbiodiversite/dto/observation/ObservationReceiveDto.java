package org.example.tpbiodiversite.dto.observation;

import lombok.Data;
import org.example.tpbiodiversite.entity.Observation;
import org.example.tpbiodiversite.entity.Specie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
public class ObservationReceiveDto {
    private long specie_id;
    private String observerName;
    private String location;
    private double latitude;
    private double longitude;
    private String observationDate;
    private String comment;

    public Observation dtoToEntity(Specie specie) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return Observation.builder()
                .specie(specie)
                .observerName(observerName)
                .location(location)
                .latitude(latitude)
                .longitude(longitude)
                .observationDate(LocalDate.parse(observationDate, formatter))
                .comment(comment)
                .build();
    }
}
