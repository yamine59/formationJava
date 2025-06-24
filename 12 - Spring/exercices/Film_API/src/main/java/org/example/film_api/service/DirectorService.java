package org.example.film_api.service;

import org.example.film_api.dto.DirectorReceiveDto;
import org.example.film_api.dto.DirectorResponseDto;
import org.example.film_api.entity.Director;
import org.example.film_api.repository.DirectorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

    private final DirectorRepository directorRepository;

    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    public DirectorResponseDto create (DirectorReceiveDto director) {
        return directorRepository.save(director.dtoToEntity()).entityToDto();
    }

    public DirectorResponseDto update (long id, DirectorReceiveDto director) {
        Director directorToUpdate = directorRepository.findById(id).orElse(null);
        Director directorGet = director.dtoToEntity();
        directorToUpdate.setFirstname(directorGet.getFirstname());
        directorToUpdate.setLastname(directorGet.getLastname());
        directorToUpdate.setBirthday(directorGet.getBirthday());
        return directorRepository.save(directorToUpdate).entityToDto();
    }

    public void delete (long id) {
        directorRepository.deleteById(id);
    }

    public DirectorResponseDto get (long id) {
        return directorRepository.findById(id).orElse(null).entityToDto();
    }

    public List<DirectorResponseDto> get () {
        return directorRepository.findAll().stream().map(Director::entityToDto).toList();
    }



}
