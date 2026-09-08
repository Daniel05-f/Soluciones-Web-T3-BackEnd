package com.upn.repository;

import com.upn.model.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISpecialtyRepository extends IGenericRepository<Specialty, Integer>{
  /*public Specialty findById(int id);
  public Specialty findAll(String name);
  public void DeleteById(int id);
  public Specialty save(Specialty specialty);
  public Specialty update(Specialty specialty, Integer id);*/
}
