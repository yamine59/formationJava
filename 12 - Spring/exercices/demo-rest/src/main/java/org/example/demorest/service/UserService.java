package org.example.demorest.service;

import org.example.demorest.dto.UserReceiveDto;
import org.example.demorest.dto.UserResponseDto;
import org.example.demorest.entity.User;
import org.example.demorest.execption.NotFoundException;
import org.example.demorest.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDto create(UserReceiveDto userReceiveDto){
        return userRepository.save(userReceiveDto.dtoToEntity()).entityToDto();
    }

    public UserResponseDto get(Long id){
        return userRepository.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }

    public List<UserResponseDto> get(){
        return userRepository.findAll().stream().map(User::entityToDto).toList();
    }

    public UserResponseDto update(long id, UserReceiveDto userReceiveDto){
        User userToUpdate = userRepository.findById(id).orElseThrow(NotFoundException::new);
        User userGet = userReceiveDto.dtoToEntity();
        userToUpdate.setName(userGet.getName());
        userToUpdate.setBirthdate(userGet.getBirthdate());
        userToUpdate.setPassword(userGet.getPassword());
        return userRepository.save(userToUpdate).entityToDto();
    }
    public void delete(long id){
        userRepository.deleteById(id);
    }
}
