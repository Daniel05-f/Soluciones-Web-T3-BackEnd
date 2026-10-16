package com.upn.controller;

import com.upn.dto.MedicDTO;
import com.upn.dto.PatientDTO;
import com.upn.model.Medic;
import com.upn.model.Patient;
import com.upn.service.IMedicService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1/medics")
@RequiredArgsConstructor
public class MedicController {
    private final IMedicService service;

    @Qualifier("medicMapper")
    private final ModelMapper modelMapper;

    @GetMapping
    private ResponseEntity<List<MedicDTO>> findAll() throws  Exception{
        List<MedicDTO> list = service.findAll().stream().map(this::convertToDTO).toList();
        return ResponseEntity.ok(list); // 200
    }

    @GetMapping("/{id}")
    private ResponseEntity<MedicDTO> findById(@PathVariable Integer id) throws  Exception{
        Medic obj = service.findById(id);
        return ResponseEntity.ok(convertToDTO(obj)); // 200
    }

    @PostMapping
    private ResponseEntity<Void> save(@RequestBody MedicDTO dto) throws Exception{
        Medic obj = service.save(convertToEntity(dto));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(obj.getIdMedic())
                .toUri();
        return ResponseEntity.created(location).build(); // 201
    }

    @PutMapping("/{id}")
    private ResponseEntity<MedicDTO> update(@PathVariable Integer id, @RequestBody MedicDTO dto) throws Exception{
        Medic obj = service.update(id, convertToEntity(dto));
        return ResponseEntity.ok(convertToDTO(obj)); //200
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Void> delete(@PathVariable Integer id) throws Exception{
        service.delete(id);
        return ResponseEntity.noContent().build(); // 204
    }

    private Medic convertToEntity(MedicDTO dto) throws Exception{
        return modelMapper.map(dto, Medic.class);
    }

    private MedicDTO convertToDTO(Medic obj){
        return modelMapper.map(obj, MedicDTO.class);
    }
}
