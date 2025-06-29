package org.example.tpbiodiversite.dto.travellog;

import lombok.Data;
import org.example.tpbiodiversite.ENUM.TravelMode;
import org.example.tpbiodiversite.entity.Observation;
import org.example.tpbiodiversite.entity.TravelLog;

@Data
public class TravelReceiveDto {
    private long observation_id;
    private double distanceKm;
    private String mode;

    public TravelLog dtoToEntity(Observation observation) {
        mode = mode.toUpperCase();
        return TravelLog.builder()
                .observation(observation)
                .distanceKm(distanceKm)
                .mode(TravelMode.valueOf(mode))
                .build();
    }
}
