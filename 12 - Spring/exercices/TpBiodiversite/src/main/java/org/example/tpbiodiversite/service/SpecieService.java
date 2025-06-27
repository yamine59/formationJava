package org.example.tpbiodiversite.service;

import org.example.tpbiodiversite.dto.specie.SpecieReceiveDto;
import org.example.tpbiodiversite.dto.specie.SpecieResponseDto;
import org.example.tpbiodiversite.entity.Specie;
import org.example.tpbiodiversite.execption.NotFoundException;
import org.example.tpbiodiversite.repository.SpecieRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecieService {

    private final SpecieRepo specieRepo;

    public SpecieService(SpecieRepo specieRepo) {
        this.specieRepo = specieRepo;
    }

    public SpecieResponseDto save(SpecieReceiveDto specieReceiveDto){
        return specieRepo.save(specieReceiveDto.dtoToEntity()).entityToDto();
    }

    public SpecieResponseDto findById( long specie_id){
        return specieRepo.findById(specie_id).orElseThrow(NotFoundException::new).entityToDto();
    }

    public List<SpecieResponseDto> findAll(){
        return specieRepo.findAll().stream().map(Specie::entityToDto).toList();
    }

    public SpecieResponseDto update(long specie_id, SpecieReceiveDto specieReceiveDto){
        Specie specie = specieRepo.findById(specie_id).orElseThrow(NotFoundException::new);
        Specie specieGet = specieReceiveDto.dtoToEntity();
        specie.setCommonName(specieGet.getCommonName());
        specie.setScientificName(specieGet.getScientificName());
        specie.setCategory(specieGet.getCategory());
        return specieRepo.save(specie).entityToDto();
    }

    public void delete(long specie_id){
        specieRepo.deleteById(specie_id);
    }

}
