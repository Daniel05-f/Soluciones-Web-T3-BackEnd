package com.upn.service.implementation;

import com.upn.model.Specialty;
import com.upn.repository.IGenericRepository;
import com.upn.repository.ISpecialtyRepository;
import com.upn.service.ISpecialtyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SpecialtyService extends GenericService<Specialty, Integer> implements ISpecialtyService {

    private final ISpecialtyRepository repo;

    @Override
    protected IGenericRepository<Specialty, Integer> getRepo() {
        return repo;
    }

    @Override
    public Page<Specialty> listPaginable(Pageable pageable) {
        return repo.findAll(pageable);
    }
/*
    @Override
    public Specialty save(Specialty specialty) throws Exception {
        return repo.save(specialty);
    }

    @Override
    public Specialty update(Integer id, Specialty specialty) throws Exception {
        // TODO: validar el ID
        return repo.save(specialty);
    }

    @Override
    public List<Specialty> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Specialty findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Specialty());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }**/
}
