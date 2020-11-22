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

import com.coisas_coisas.model.Titulo;
import com.coisas_coisas.service.TituloService;


@RestController
@RequestMapping(value = "/titulos")
public class TituloController {
	@Autowired
	private TituloService TituloService;
	
	@PostMapping(path = "/save")
	  public void salvarNutricionista(@RequestBody Titulo Titulo) {
		TituloService.Salvar(Titulo);
	 }
	
	@GetMapping(path = "/")
	  public List<Titulo> buscarNutricionistas() {
	    return TituloService.BuscarTodos();
	}
	
	@GetMapping(path = "/buscar/{codigo_Titulo}")
	  public Optional<Titulo> buscarNutricionistasPorId(@PathVariable(name = "codigo_Titulo", required = true) int codigo_Titulo) throws Exception {
	    return TituloService.buscarPorID(codigo_Titulo);
	  }
	
	@DeleteMapping(path = "/delete/{codigo_Titulo}")
	public void deleteNutricionista(@PathVariable(name = "codigo_Titulo", required = true) int codigo_Titulo) throws Exception {
		TituloService.Deletar(codigo_Titulo);
	    
	}
}

