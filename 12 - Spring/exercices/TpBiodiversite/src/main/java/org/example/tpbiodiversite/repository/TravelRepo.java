package org.example.tpbiodiversite.repository;

import org.example.tpbiodiversite.entity.Observation;
import org.example.tpbiodiversite.entity.TravelLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TravelRepo extends JpaRepository<TravelLog, Long> {
    List<TravelLog> findByObservation(Observation observation);
}
