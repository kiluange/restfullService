package com.example.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.locadora.model.Filial;

@Repository
public interface FilialRepositoryImpl extends JpaRepository<Filial, Long> {

}
