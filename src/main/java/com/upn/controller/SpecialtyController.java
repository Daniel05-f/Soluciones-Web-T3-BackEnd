package com.upn.controller;

import com.upn.dto.SpecialtyDTO;
import com.upn.model.Specialty;
import com.upn.service.ISpecialtyService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1/specialties")
@RequiredArgsConstructor
public class SpecialtyController {
    private final ISpecialtyService service;

    @Qualifier("defaultMapper")
    private final ModelMapper modelMapper;

    @GetMapping
    private ResponseEntity<List<SpecialtyDTO>> findAll() throws  Exception{
        //ModelMapper modelMapper = new ModelMapper();
        // List<Specialty> list = service.findAll();
        //List<SpecialtyDTO> list = service.findAll().stream().map(e->new SpecialtyDTO(e.getIdSpecialty(), e.getName(), e.getDescription())).toList();
        List<SpecialtyDTO> list = service.findAll().stream().map(this::convertToDTO).toList();
        return ResponseEntity.ok(list); // 200
    }

    @GetMapping("/{id}")
    private ResponseEntity<SpecialtyDTO> findById(@PathVariable Integer id) throws  Exception{
        Specialty obj = service.findById(id);
        return ResponseEntity.ok(convertToDTO(obj)); // 200
    }

    @PostMapping
    private ResponseEntity<Void> save(@RequestBody SpecialtyDTO dto) throws Exception{
        Specialty obj = service.save(convertToEntity(dto));
        //return new ResponseEntity<>(obj, HttpStatus.CREATED); // 201
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(obj.getIdSpecialty())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/{id}")
    private ResponseEntity<SpecialtyDTO> update(@PathVariable Integer id, @RequestBody SpecialtyDTO dto) throws Exception{
        Specialty obj = service.update(id, convertToEntity(dto));
        return ResponseEntity.ok(convertToDTO(obj)); // 200
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Void> delete(@PathVariable Integer id) throws Exception{
        service.delete(id);
        return ResponseEntity.noContent().build(); // 204
    }

    private Specialty convertToEntity(SpecialtyDTO dto) throws Exception{
        return modelMapper.map(dto, Specialty.class);
    }

    private SpecialtyDTO convertToDTO(Specialty obj){
        return modelMapper.map(obj, SpecialtyDTO.class);
    }
}
