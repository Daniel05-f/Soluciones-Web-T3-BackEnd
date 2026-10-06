package com.upn.controller;

import com.upn.dto.PatientDTO;
import com.upn.model.Patient;
import com.upn.service.IPatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1/patients")
@RequiredArgsConstructor
// @CrossOrigin(origins = {"",""})
public class PatientController {
    private final IPatientService service;

    @Qualifier("defaultMapper")
    private final ModelMapper modelMapper;

    @GetMapping
    private ResponseEntity<List<PatientDTO>> findAll() throws  Exception{
        List<PatientDTO> list = service.findAll().stream().map(this::convertToDTO).toList();
        return ResponseEntity.ok(list); // 200
    }

    @GetMapping("/{id}")
    private ResponseEntity<PatientDTO> findById(@PathVariable Integer id) throws  Exception{
        Patient obj = service.findById(id);
        return ResponseEntity.ok(convertToDTO(obj)); // 200
    }

    @PostMapping
    private ResponseEntity<Void> save(@Valid @RequestBody PatientDTO dto) throws Exception{
        Patient obj = service.save(convertToEntity(dto));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(obj.getIdPatient())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/{id}")
    private ResponseEntity<PatientDTO> update(@Valid @PathVariable Integer id, @RequestBody PatientDTO dto) throws Exception{
        Patient obj = service.update(id, convertToEntity(dto));
        return ResponseEntity.ok(convertToDTO(obj)); // 200
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Void> delete(@PathVariable Integer id) throws Exception{
        service.delete(id);
        return ResponseEntity.noContent().build(); // 204
    }

    private Patient convertToEntity(PatientDTO dto) throws Exception{
        return modelMapper.map(dto, Patient.class);
    }

    private PatientDTO convertToDTO(Patient obj){
        return modelMapper.map(obj, PatientDTO.class);
    }
}
