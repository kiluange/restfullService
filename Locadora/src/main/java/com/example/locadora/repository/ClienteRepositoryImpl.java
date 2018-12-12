package com.example.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.locadora.model.Cliente;

@Repository
public interface ClienteRepositoryImpl extends JpaRepository<Cliente, Long>{

}
