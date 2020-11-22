package com.coisas_coisas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coisas_coisas.model.Venda;
import com.coisas_coisas.service.VendaService;

@RestController
@RequestMapping(value = "/vendas")
public class VendaController {
	@Autowired
	private VendaService VendaService;
	
	@PostMapping(path = "/save")
	  public void salvarNutricionista(@RequestBody Venda Venda) {
		VendaService.Salvar(Venda);
	 }
	
	@GetMapping(path = "/")
	  public List<Venda> buscarNutricionistas() {
	    return VendaService.BuscarTodos();
	}
	
	@GetMapping(path = "/buscar/{codigo_Venda}")
	  public Optional<Venda> buscarNutricionistasPorId(@PathVariable(name = "codigo_Venda", required = true) int codigo_Venda) throws Exception {
	    return VendaService.buscarPorID(codigo_Venda);
	  }
	
	@DeleteMapping(path = "/delete/{codigo_Venda}")
	public void deleteNutricionista(@PathVariable(name = "codigo_Venda", required = true) int codigo_Venda) throws Exception {
		VendaService.Deletar(codigo_Venda);
	    
	}
}
