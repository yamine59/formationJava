package org.example.tpbiodiversite.repository;

import org.example.tpbiodiversite.entity.Specie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecieRepo extends JpaRepository<Specie, Long> {
}
