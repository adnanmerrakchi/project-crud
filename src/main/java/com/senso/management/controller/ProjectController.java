package com.senso.management.controller;

import com.senso.management.criteria.ProjectCriteria;
import com.senso.management.dto.ProjectAddDTO;
import com.senso.management.dto.ProjectShowDTO;
import com.senso.management.dto.ProjectUpdateDTO;
import com.senso.management.exception.ResourceNotFoundException;
import com.senso.management.model.Project;
import com.senso.management.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/projects")
public class ProjectController {

    private ProjectService projectService;


    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/filter")
    public Page<ProjectShowDTO> getByFilter(    Pageable page,
                                                ProjectCriteria criteria) {
        return projectService.filter(page, criteria);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Project> getOne(@PathVariable("id") Long id) {
        return this.projectService.getOneProject(id)
                .map(item -> ResponseEntity.ok(item))
                .orElseThrow(ResourceNotFoundException::new);
    }

    @PostMapping
    public ResponseEntity<Project> addProject(@RequestBody ProjectAddDTO dto) {
        return ResponseEntity.ok(this.projectService.addProject(dto));
    }

    @PutMapping
    public ResponseEntity<Project> updateProject(@RequestBody ProjectUpdateDTO dto) {
        return ResponseEntity.ok(this.projectService.updateProject(dto)) ;
    }


}
