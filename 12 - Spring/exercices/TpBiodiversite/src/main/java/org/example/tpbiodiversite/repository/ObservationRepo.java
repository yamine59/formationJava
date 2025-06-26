package org.example.tpbiodiversite.repository;

import org.example.tpbiodiversite.entity.Observation;
import org.example.tpbiodiversite.entity.Specie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ObservationRepo extends JpaRepository<Observation, Long> {
    List<Observation> findBySpecie(Specie specie);
    List<Observation> findByLocation(String location);
    Observation findByObserverName(String observerName);
}
