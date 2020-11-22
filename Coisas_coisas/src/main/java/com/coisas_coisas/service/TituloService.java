package com.coisas_coisas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coisas_coisas.model.Titulo;
import com.coisas_coisas.repository.TituloRepository;

@Service
public class TituloService {
	@Autowired
	private TituloRepository TituloRepository;
	
	//salvar
	public void Salvar(Titulo Titulo) {
	    try {
	    	TituloRepository.saveAndFlush(Titulo);
	    		    	
	    }catch (Exception e) {
			e.getMessage();
		}
	  }
	
	//buscar por id
	public Optional<Titulo> buscarPorID(int Codigo_Titulo) throws Exception {
		return TituloRepository.findById(Codigo_Titulo);
	    
	  }
	
	public List<Titulo> BuscarTodos(){
		 return TituloRepository.findAll();
	}
	
	public void Deletar(int Codigo_Titulo) throws Exception{
	    TituloRepository.deleteById(Codigo_Titulo);
	   
	}
}
