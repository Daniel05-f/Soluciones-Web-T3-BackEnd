package com.upn.service.implementation;

import com.upn.model.Medic;
import com.upn.repository.IMedicRepository;
import com.upn.repository.IGenericRepository;
import com.upn.service.IMedicService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicService extends GenericService<Medic, Integer> implements IMedicService {

    private final IMedicRepository repo;

    @Override
    protected IGenericRepository<Medic, Integer> getRepo() {
        return repo;
    }

    @Override
    public List<Medic> topTen() throws Exception {
        return List.of();
    }
}
