package com.coisas_coisas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coisas_coisas.model.Cliente;

import com.coisas_coisas.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	@Autowired
	private ClienteService ClienteService;
	
	@PostMapping(path = "/save")
	  public void salvarNutricionista(@RequestBody Cliente Cliente) {
		ClienteService.Salvar(Cliente);
	 }
	
	@GetMapping(path = "/")
	  public List<Cliente> buscarNutricionistas() {
	    return ClienteService.BuscarTodos();
	}
	
	@GetMapping(path = "/cpf/{cpf}")
	  public Cliente buscarNutricionistasPorId(@PathVariable(name = "cpf", required = true) String cpf) throws Exception {
	    return ClienteService.buscarPorCpf(cpf);
	  }
	
	@DeleteMapping(path = "/delete/{cpf}")
	public void deleteNutricionista(@PathVariable(name = "cpf", required = true) String cpf) throws Exception {
		ClienteService.DeletarCpf(cpf);
	    
	}
}
