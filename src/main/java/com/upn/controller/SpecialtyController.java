package com.upn.controller;

import com.upn.model.Specialty;
import com.upn.service.ISpecialtyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/specialties")
@RequiredArgsConstructor
public class SpecialtyController {
    private final ISpecialtyService service;

    @GetMapping
    private ResponseEntity<List<Specialty>> findAll() throws  Exception{
        List<Specialty> list = service.findAll();
        return ResponseEntity.ok(list); // 200
    }

    @GetMapping("/{id}")
    private ResponseEntity<Specialty> findById(@PathVariable Integer id) throws  Exception{
        Specialty obj = service.findById(id);
        return ResponseEntity.ok(obj); // 200
    }

    @PostMapping
    private ResponseEntity<Specialty> save(@RequestBody Specialty specialty) throws Exception{
        Specialty obj = service.save(specialty);
        return new ResponseEntity<>(obj, HttpStatus.CREATED); // 201
    }

    @PutMapping("/{id}")
    private ResponseEntity<Specialty> update(@PathVariable Integer id, @RequestBody Specialty specialty) throws Exception{
        Specialty obj = service.update(id, specialty);
        return ResponseEntity.ok(obj);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Void> delete(@PathVariable Integer id) throws Exception{
        service.delete(id);
        return ResponseEntity.noContent().build(); // 204
    }
}
