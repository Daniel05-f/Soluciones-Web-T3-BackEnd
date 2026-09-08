package com.upn.repository;

import com.upn.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

//public interface IExamRepository extends JpaRepository<Exam, Integer>{
public interface IExamRepository extends IGenericRepository<Exam, Integer>{
}
