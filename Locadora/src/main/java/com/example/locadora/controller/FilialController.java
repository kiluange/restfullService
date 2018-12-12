package com.example.locadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.locadora.model.Endereco;
import com.example.locadora.model.Filial;
import com.example.locadora.service.FIlialService;

@RestController
@RequestMapping("/filial")
public class FilialController {

	@Autowired
	FIlialService service;

	@GetMapping("")
	private List<Filial> getFilial() {
		return service.buscarTodasFiliais();

	}

	@PutMapping("")
	private void putFilial() {
		// TODO Auto-generated method stub

	}

	@PostMapping("")
	private Filial postFilial(@RequestParam(value = "estado", required = true) String estado,
			@RequestParam(value = "cidade", required = true) String cidade,
			@RequestParam(value = "logradouro", required = true) String logradouro,
			@RequestParam(value = "numero", required = true) String numero,
			@RequestParam(value = "cep", required = true) String cep) {

		Filial filial = new Filial();

		filial.setEndereco(new Endereco(estado, cidade, Integer.valueOf(cep), logradouro, Integer.valueOf(numero)));
		
		return service.saveFilial(filial);

	}

	@DeleteMapping("")
	private void deleteFilial() {
		// TODO Auto-generated method stub

	}
}
