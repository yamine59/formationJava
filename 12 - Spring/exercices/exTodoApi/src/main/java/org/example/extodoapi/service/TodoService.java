package org.example.extodoapi.service;

import org.apache.catalina.User;
import org.example.extodoapi.dto.TodoReceiveDto;
import org.example.extodoapi.dto.TodoResponseDto;
import org.example.extodoapi.entity.Todo;
import org.example.extodoapi.exception.NotFoundException;
import org.example.extodoapi.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.List;
import java.util.UUID;

@Service
public class TodoService {
    private final TodoRepository todoRepository ;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoResponseDto create(TodoReceiveDto todoReceiveDto){
        return todoRepository.save(todoReceiveDto.dtoToEntity()).entityToDto();
    }

    public TodoResponseDto get(UUID id){
        return todoRepository.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }

    public List<TodoResponseDto> get(){
        return todoRepository.findAll().stream().map(Todo::entityToDto).toList();
    }

    public TodoResponseDto update(UUID id ,TodoReceiveDto todoReceiveDto){
        Todo todoUpdate = todoRepository.findById(id).orElseThrow(NotFoundException::new);
        Todo todoGet = todoReceiveDto.dtoToEntity();
        todoUpdate.setTitle(todoGet.getTitle());
        todoUpdate.setDescription(todoGet.getDescription());
        todoUpdate.setDate(todoGet.getDate());
        todoUpdate.setValidate(todoGet.isValidate());
        return todoRepository.save(todoUpdate).entityToDto();

    }

    public TodoResponseDto toggleValidate(UUID id){
        Todo todo = todoRepository.findById(id).orElseThrow(NotFoundException::new);
        todo.setValidate(!todo.isValidate());
        todoRepository.save(todo);
        return todo.entityToDto();
    }

    public List<TodoResponseDto> getByStatus (boolean status){
        return todoRepository.getTodoByValidate(status).stream().map(Todo::entityToDto).toList();
    }


    public void delete(UUID id){
        todoRepository.deleteById(id);
    }
}
