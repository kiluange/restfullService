package com.example.locadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.locadora.model.Filial;
import com.example.locadora.repository.FilialRepositoryImpl;

@Service
public class FIlialService {
	
	@Autowired
	FilialRepositoryImpl filialRepositoryImpl;
	
	public Filial saveFilial(Filial filial) {
		return filialRepositoryImpl.save(filial);
	}

	public List<Filial> buscarTodasFiliais() {
		return filialRepositoryImpl.findAll();
		
	}

}
