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

import com.coisas_coisas.model.Produto_Venda;
import com.coisas_coisas.service.Produto_VendaService;

@RestController
@RequestMapping(value = "/produto_vendas")
public class Produto_VendaController {
	@Autowired
	private Produto_VendaService Produto_VendaService;
	
	@PostMapping(path = "/save")
	  public void salvarNutricionista(@RequestBody Produto_Venda Produto_Venda) {
		Produto_VendaService.Salvar(Produto_Venda);
	 }
	
	@GetMapping(path = "/")
	  public List<Produto_Venda> buscarNutricionistas() {
	    return Produto_VendaService.BuscarTodos();
	}
	
	@GetMapping(path = "/buscar/{codigo_Produto_Venda}")
	  public Optional<Produto_Venda> buscarNutricionistasPorId(@PathVariable(name = "codigo_Produto_Venda", required = true) int codigo_Produto_Venda) throws Exception {
	    return Produto_VendaService.buscarPorID(codigo_Produto_Venda);
	  }
	
	@DeleteMapping(path = "/delete/{codigo_Produto_Venda}")
	public void deleteNutricionista(@PathVariable(name = "codigo_Produto_Venda", required = true) int codigo_Produto_Venda) throws Exception {
		Produto_VendaService.Deletar(codigo_Produto_Venda);
	    
	}

}
