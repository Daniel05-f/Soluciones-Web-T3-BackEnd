package com.upn.service.implementation;

import com.upn.model.Exam;
import com.upn.repository.IExamRepository;
import com.upn.service.IExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamService implements IExamService {

    private final IExamRepository repo;

    @Override
    public Exam save(Exam exam) throws Exception {
        return repo.save(exam);
    }

    @Override
    public Exam update(Integer id, Exam exam) throws Exception {
        // TODO: validar el ID
        return repo.save(exam);
    }

    @Override
    public List<Exam> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Exam findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Exam());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
