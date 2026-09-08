package com.upn.controller;

import com.upn.model.Exam;
import com.upn.service.IExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/exams")
@RequiredArgsConstructor
public class ExamController {
    private final IExamService service;

    @GetMapping
    private ResponseEntity<List<Exam>> findAll() throws  Exception{
        List<Exam> list = service.findAll();
        return ResponseEntity.ok(list); // 200
    }

    @GetMapping("/{id}")
    private ResponseEntity<Exam> findById(@PathVariable Integer id) throws  Exception{
        Exam obj = service.findById(id);
        return ResponseEntity.ok(obj); // 200
    }

    @PostMapping
    private ResponseEntity<Exam> save(@RequestBody Exam exam) throws Exception{
        Exam obj = service.save(exam);
        return new ResponseEntity<>(obj, HttpStatus.CREATED); // 201
    }

    @PutMapping("/{id}")
    private ResponseEntity<Exam> update(@PathVariable Integer id, @RequestBody Exam exam) throws Exception{
        Exam obj = service.update(id, exam);
        return ResponseEntity.ok(obj);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Void> delete(@PathVariable Integer id) throws Exception{
        service.delete(id);
        return ResponseEntity.noContent().build(); // 204
    }
}
