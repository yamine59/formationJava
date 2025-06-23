package org.example.extodoapi.repository;

import org.example.extodoapi.dto.TodoResponseDto;
import org.example.extodoapi.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TodoRepository extends JpaRepository<Todo,UUID> {

    @Query("SELECT t FROM Todo t WHERE t.isValidate = ?1")
    List<Todo> getTodoByValidate(boolean validate);
}
