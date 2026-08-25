package com.upn.service;

import com.upn.model.Patient;
import com.upn.repository.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Estereotipo
//@AllArgsConstructor
@RequiredArgsConstructor
public class PatientService {
    // @Autowired // Inyección de dependencias
    private final PatientRepository repo;
    private String texto;
    private Integer number1;

    // Inyección de dependencias por constructor
    /*public PatientService(PatientRepository repo) {
        this.repo = repo;
    }*/

    public Patient validAndSave(Integer idPatient, String firstName) {
        if(idPatient != null || firstName != null) {
            // repo = new PatientRepository();
            return repo.searchPatient(idPatient, firstName);
        } else{
            return new Patient(0,"DEFAULT");
        }
    }
}
