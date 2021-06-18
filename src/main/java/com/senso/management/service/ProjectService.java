package com.senso.management.service;

import com.senso.management.criteria.ProjectCriteria;
import com.senso.management.dto.ProjectAddDTO;
import com.senso.management.dto.ProjectShowDTO;
import com.senso.management.dto.ProjectUpdateDTO;
import com.senso.management.exception.ResourceNotFoundException;
import com.senso.management.model.Category;
import com.senso.management.model.Project;
import com.senso.management.repository.ProjectRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    ModelMapper modelMapper;

    public Optional<Project> getOneProject(Long id) {
        return this.projectRepository.findById(id);
    }

    public Project addProject(ProjectAddDTO dto) {
        return this.projectRepository.save(modelMapper.map(dto, Project.class));
    }

    public Project updateProject(ProjectUpdateDTO dto) throws ResourceNotFoundException {
        return projectRepository.findById(dto.getId())
                .map(item -> {
                    item.setName(dto.getName());
                    item.setDeliveryDate(dto.getDeliveryDate());
                    item.setIndividuels(dto.getIndividuels());
                    return this.projectRepository.save(item);
                })
                .orElseThrow(ResourceNotFoundException::new);
    }

    public Page<ProjectShowDTO> filter(Pageable page, ProjectCriteria criteria) {
        return projectRepository.productFilter(page, criteria.getIndividual(), Category.valueOf(criteria.getCategory()));
    }
}
