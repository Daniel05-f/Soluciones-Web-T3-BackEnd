package com.upn.service.implementation;

import com.upn.model.Patient;
import com.upn.repository.IPatientRepository;
import com.upn.repository.IGenericRepository;
import com.upn.service.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService extends GenericService<Patient, Integer> implements IPatientService {

    private final IPatientRepository repo;

    @Override
    protected IGenericRepository<Patient, Integer> getRepo() {
        return repo;
    }
}
