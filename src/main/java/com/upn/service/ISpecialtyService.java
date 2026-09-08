package com.upn.service;

import com.upn.model.Specialty;

import java.util.List;

public interface ISpecialtyService {
    Specialty save(Specialty specialty) throws Exception;
    Specialty update(Integer id, Specialty specialty) throws Exception;
    List<Specialty> findAll() throws Exception;
    Specialty findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}
