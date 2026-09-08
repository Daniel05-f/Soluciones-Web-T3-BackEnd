package com.upn.controller;

import com.upn.model.Medic;
import com.upn.service.IMedicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/medics")
@RequiredArgsConstructor
public class MedicController {
    private final IMedicService service;

    @GetMapping
    private ResponseEntity<List<Medic>> findAll() throws  Exception{
        List<Medic> list = service.findAll();
        return ResponseEntity.ok(list); // 200
    }

    @GetMapping("/{id}")
    private ResponseEntity<Medic> findById(@PathVariable Integer id) throws  Exception{
        Medic obj = service.findById(id);
        return ResponseEntity.ok(obj); // 200
    }

    @PostMapping
    private ResponseEntity<Medic> save(@RequestBody Medic medic) throws Exception{
        Medic obj = service.save(medic);
        return new ResponseEntity<>(obj, HttpStatus.CREATED); // 201
    }

    @PutMapping("/{id}")
    private ResponseEntity<Medic> update(@PathVariable Integer id, @RequestBody Medic medic) throws Exception{
        Medic obj = service.update(id, medic);
        return ResponseEntity.ok(obj);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Void> delete(@PathVariable Integer id) throws Exception{
        service.delete(id);
        return ResponseEntity.noContent().build(); // 204
    }
}
