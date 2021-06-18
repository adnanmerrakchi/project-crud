package com.senso.management.controller;

import com.senso.management.dto.IndividuelAddDTO;
import com.senso.management.dto.IndividuelUpdateDTO;
import com.senso.management.exception.ResourceNotFoundException;
import com.senso.management.model.Individuel;
import com.senso.management.service.IndividuelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/individuels")
public class IndividuelController {

    private IndividuelService individuelService;


    @Autowired
    public IndividuelController(IndividuelService individuelService) {
        this.individuelService = individuelService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Individuel> getOne(@PathVariable("id") Long id) {
        return this.individuelService.getOneIndividuel(id)
                .map(ResponseEntity::ok)
                .orElseThrow(ResourceNotFoundException::new);

    }

    @PostMapping
    public ResponseEntity<Individuel> addIndividuel(@RequestBody IndividuelAddDTO dto) {
        return ResponseEntity.status(201)
                .body(individuelService.addIndividuel(dto));
    }

    @PutMapping
    public ResponseEntity<Individuel> updateIndividuel(@RequestBody IndividuelUpdateDTO dto) {
        return ResponseEntity.ok(individuelService.updateIndividual(dto));
    }

}
