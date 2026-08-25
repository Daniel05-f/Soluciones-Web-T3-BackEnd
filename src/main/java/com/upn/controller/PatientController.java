package com.upn.controller;

import com.upn.model.Patient;
import com.upn.service.PatientService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080/v1/patients
// Inyección tipos: por método, por constructor, por atributo
@RestController // Comportamiento para API
@RequestMapping("/v1/patients")
//@AllArgsConstructor
@RequiredArgsConstructor
public class PatientController {
    // @Autowired // Inyección de dependencias
    private final PatientService service;

    // Inyección de dependencias por constructor
    /*public PatientController(PatientService service) {
        this.service = service;
    }*/

    @GetMapping
    public Patient searchPatient(){
        //service = new PatientService();
        return service.validAndSave(1,"Kamila");
    }
}
