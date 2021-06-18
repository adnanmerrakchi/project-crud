package com.senso.management.service;

import com.senso.management.dto.IndividuelAddDTO;
import com.senso.management.dto.IndividuelUpdateDTO;
import com.senso.management.exception.ResourceNotFoundException;
import com.senso.management.model.Individuel;
import com.senso.management.repository.IndividuelRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IndividuelService {

    @Autowired
    private IndividuelRepository individuelRepository;

    @Autowired
    ModelMapper modelMapper;


    public Individuel addIndividuel(IndividuelAddDTO dto) {
        Individuel individuel = this.modelMapper.map(dto, Individuel.class);
        return this.individuelRepository.save(individuel);
    }

    public Individuel updateIndividual(IndividuelUpdateDTO dto) throws ResourceNotFoundException {
        return individuelRepository.findById(dto.getId())
                .map(item -> {
                    item.setFirstName(dto.getFirstName());
                    item.setLastName(dto.getLastName());
                    item.setPhone(dto.getPhone());
                    item.setProfile(dto.getProfile());
                    return this.individuelRepository.save(item);
                })
                .orElseThrow(ResourceNotFoundException::new);
    }

    public Optional<Individuel> getOneIndividuel(Long id) {
        return individuelRepository.findById(id);
    }

}
