package com.example.locadora.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.locadora.model.Cliente;
import com.example.locadora.repository.ClienteRepositoryImpl;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepositoryImpl clienteRepositoryImpl;
	
	public List<Cliente> buscarTodosOsClientes() {
		return clienteRepositoryImpl.findAll();
	}
	
	public Optional<Cliente> buscarUmCliente(Long id) {
		return clienteRepositoryImpl.findById(id);

	}
	
	public Cliente salvaCliente(Cliente cliente) {
		return clienteRepositoryImpl.save(cliente);
	}
	
	public void deleteCliente(Long id) {
		clienteRepositoryImpl.deleteById(id);

	}

	public Object buscarCLientePorCnh(Integer cpf) {
		return clienteRepositoryImpl.findClienteByCnh(cpf);
	}

}
