package com.example.locadora.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.locadora.model.Cliente;
import com.example.locadora.model.Endereco;
import com.example.locadora.model.PessoaFisica;
import com.example.locadora.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteService clienteService;

	@GetMapping("")
	private List<Cliente> getCliente(@RequestParam(value = "id", required = false) Long id) {
		if (id == null) {
			return clienteService.buscarTodosOsClientes();
		} else {
			return List.of(clienteService.buscarUmCliente(id).get());
		}
	}
	
	@GetMapping("/pfisica")
	private Object getCLienteByCpf(@RequestParam(value = "cnh", required = true) Integer cnh) {
		return clienteService.buscarCLientePorCnh(cnh); 		
	}

	@PutMapping("")
	private Cliente putCliente(@RequestParam(value = "id", required = true) Long id) {
		Cliente cliente = clienteService.buscarUmCliente(id).get();
		cliente.setNome("teste");
		return clienteService.salvaCliente(cliente);

	}

	@DeleteMapping("")
	private void deleteCliente(@RequestParam(value = "id", required = true) Long id) {
		clienteService.deleteCliente(id);

	}

	@PostMapping("")
	private Cliente postCliente(@RequestParam(value = "tipo", required = true) Character tipo,
			@RequestParam(value = "nome", required = true) String nome,
			@RequestParam(value = "cnh", required = true) String cnh,
			@RequestParam(value = "validade", required = true) String validade,
			@RequestParam(value = "cpf", required = false) String cpf,
			@RequestParam(value = "cnpj", required = false) String cnpj,
			@RequestParam(value = "iestadual", required = false) String iestadual,
			@RequestParam(value = "sexo", required = true) Character sexo,
			@RequestParam(value = "aniversario", required = true) String aniversario,
			@RequestParam(value = "estado", required = true) String estado,
			@RequestParam(value = "cidade", required = true) String cidade,
			@RequestParam(value = "logradouro", required = true) String logradouro,
			@RequestParam(value = "numero", required = true) String numero,
			@RequestParam(value = "cep", required = true) String cep) {

		if (tipo.equals('f') || tipo.equals('F')) {
			PessoaFisica fisica = new PessoaFisica();

			fisica.setCnh(Integer.valueOf(cnh));
			fisica.setCpf(cpf);
			fisica.setNome(nome);
			fisica.setSexo(sexo);
			fisica.setAniversario(new Date());
			fisica.setValidadeCnh(new Date());
			fisica.setEndereco(new Endereco(estado, cidade, Integer.valueOf(cep), logradouro, Integer.valueOf(numero)));

			return clienteService.salvaCliente(fisica);

		}

		return null;

	}

}
