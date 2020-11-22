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

import com.coisas_coisas.model.Produto;
import com.coisas_coisas.service.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService ProdutoService;
	
	@PostMapping(path = "/save")
	  public void salvarNutricionista(@RequestBody Produto Produto) {
		ProdutoService.Salvar(Produto);
	 }
	
	@GetMapping(path = "/")
	  public List<Produto> buscarNutricionistas() {
	    return ProdutoService.BuscarTodos();
	}
	
	@GetMapping(path = "/buscar/{codigo_produto}")
	  public Optional<Produto> buscarNutricionistasPorId(@PathVariable(name = "codigo_produto", required = true) int codigo_produto) throws Exception {
	    return ProdutoService.buscarPorID(codigo_produto);
	  }
	
	@DeleteMapping(path = "/delete/{codigo_produto}")
	public void deleteNutricionista(@PathVariable(name = "codigo_produto", required = true) int codigo_produto) throws Exception {
		ProdutoService.Deletar(codigo_produto);
	    
	}
}
