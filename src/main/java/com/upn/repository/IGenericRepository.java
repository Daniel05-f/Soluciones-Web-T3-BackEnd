package com.upn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenericRepository<T, ID> extends JpaRepository<T, ID> {

}
