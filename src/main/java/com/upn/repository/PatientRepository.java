package com.upn.repository;

import com.upn.model.Patient;
import org.springframework.stereotype.Repository;

@Repository // Estereotipo
public class PatientRepository {
    public Patient searchPatient(Integer id, String firstName) {
        return  new Patient(id,firstName);
    }
}
