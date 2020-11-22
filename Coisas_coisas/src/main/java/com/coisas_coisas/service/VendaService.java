package com.coisas_coisas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coisas_coisas.model.Venda;
import com.coisas_coisas.repository.VendaRepository;

@Service
public class VendaService {
	@Autowired
	private VendaRepository VendaRepository;
	
	//salvar
	public void Salvar(Venda Venda) {
	    try {
	    	VendaRepository.saveAndFlush(Venda);
	    		    	
	    }catch (Exception e) {
			e.getMessage();
		}
	  }
	
	//buscar por id
	public Optional<Venda> buscarPorID(int Codigo_Venda) throws Exception {
		return VendaRepository.findById(Codigo_Venda);
	    
	  }
	
	public List<Venda> BuscarTodos(){
		 return VendaRepository.findAll();
	}
	
	public void Deletar(int Codigo_Venda) throws Exception{
	    VendaRepository.deleteById(Codigo_Venda);
	   
	}
}
