package org.example.film_api.service;

import org.example.film_api.dto.MovieReceiveDto;
import org.example.film_api.dto.MovieResponseDto;
import org.example.film_api.entity.Director;
import org.example.film_api.entity.Movie;
import org.example.film_api.exception.NotFoundException;
import org.example.film_api.repository.DirectorRepository;
import org.example.film_api.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;
    private final DirectorRepository directorRepository;

    public MovieService(MovieRepository movieRepository, DirectorRepository directorRepository) {
        this.movieRepository = movieRepository;
        this.directorRepository = directorRepository;
    }


    public MovieResponseDto create(MovieReceiveDto dto) {
        Director director = directorRepository.findById(dto.getDirectorId())
                .orElseThrow(() -> new RuntimeException("Director not found"));

        Movie movie = dto.dtoToEntity(director);
        return movieRepository.save(movie).entityToDto();
    }


    public MovieResponseDto update(long id, MovieReceiveDto movieDto) {
        Movie movieToUpdate = movieRepository.findById(id).orElse(null);
        if (movieToUpdate != null) {
            Director director = directorRepository.findById(movieDto.getDirectorId())
                    .orElseThrow(() -> new RuntimeException("Director not found"));

            Movie movieGet = movieDto.dtoToEntity(director);

            movieToUpdate.setName(movieGet.getName());
            movieToUpdate.setRelease_date(movieGet.getRelease_date());
            movieToUpdate.setDescription(movieGet.getDescription());
            movieToUpdate.setDuration(movieGet.getDuration());
            movieToUpdate.setGenre(movieGet.getGenre());
            movieToUpdate.setDirector(movieGet.getDirector());

            return movieRepository.save(movieToUpdate).entityToDto();
        }
        return null;
    }


    public void delete(long id) {
        movieRepository.deleteById(id);
    }

    public MovieResponseDto get (long id) {
        return movieRepository.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }

    public List<MovieResponseDto> get() {
        return movieRepository.findAll().stream().map(Movie::entityToDto).toList();
    }
}
