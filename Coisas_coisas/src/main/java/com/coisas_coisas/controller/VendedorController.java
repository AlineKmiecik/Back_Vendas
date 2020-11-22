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

import com.coisas_coisas.model.Vendedor;
import com.coisas_coisas.service.VendedorService;

@RestController
@RequestMapping(value = "/vendedores")
public class VendedorController {
	@Autowired
	private VendedorService VendedorService;
	
	@PostMapping(path = "/save")
	  public void salvarNutricionista(@RequestBody Vendedor Vendedor) {
		VendedorService.Salvar(Vendedor);
	 }
	
	@GetMapping(path = "/")
	  public List<Vendedor> buscarNutricionistas() {
	    return VendedorService.BuscarTodos();
	}
	
	@GetMapping(path = "/cpf/{cpf}")
	  public Vendedor buscarNutricionistasPorId(@PathVariable(name = "cpf", required = true) String cpf) throws Exception {
	    return VendedorService.buscarPorCpf(cpf);
	  }
	
	@DeleteMapping(path = "/delete/{cpf}")
	public void deleteNutricionista(@PathVariable(name = "cpf", required = true) String cpf) throws Exception {
		VendedorService.DeletarCpf(cpf);
	    
	}
}
