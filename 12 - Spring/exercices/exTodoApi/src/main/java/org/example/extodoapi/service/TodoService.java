package org.example.extodoapi.service;

import org.apache.catalina.User;
import org.example.extodoapi.dto.TodoReceiveDto;
import org.example.extodoapi.entity.Todo;
import org.example.extodoapi.exception.NotFoundException;
import org.example.extodoapi.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository ;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo create(TodoReceiveDto todoReceiveDto){
        return todoRepository.save(todoReceiveDto.dtoToEntity());
    }

    public Todo get(Long id){
        return todoRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public List<Todo> get(){
        return todoRepository.findAll();
    }

    public Todo update(long id ,TodoReceiveDto todoReceiveDto){
        Todo todoUpdate = get(id);
        Todo todoGet = todoReceiveDto.dtoToEntity();
        todoUpdate.setTitle(todoGet.getTitle());
        todoUpdate.setDescription(todoGet.getDescription());
        todoUpdate.setDate(todoGet.getDate());
        todoUpdate.setValidate(todoGet.isValidate());
        return todoRepository.save(todoUpdate);

    }

    public Todo toggleValidate(long id){
        Todo todo = get(id);
        todo.setValidate(!todo.isValidate());
        todoRepository.save(todo);
        return todo;
    }

    public List<Todo> getValidate(){
        return todoRepository.findAll().stream().filter(todo -> todo.isValidate()).toList();
    }

    public List<Todo> getNoValidate(){
        return todoRepository.findAll().stream().filter(todo -> !todo.isValidate()).toList();
    }

    public void delete(long id){
        todoRepository.deleteById(id);
    }
}
