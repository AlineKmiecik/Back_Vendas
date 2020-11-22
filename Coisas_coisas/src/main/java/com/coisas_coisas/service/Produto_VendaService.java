package com.coisas_coisas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coisas_coisas.model.Produto_Venda;
import com.coisas_coisas.repository.Produto_VendaRepository;

@Service
public class Produto_VendaService {
	@Autowired
	private Produto_VendaRepository Produto_VendaRepository;
	
	//salvar
	public void Salvar(Produto_Venda Produto_Venda) {
	    try {
	    	Produto_VendaRepository.saveAndFlush(Produto_Venda);
	    		    	
	    }catch (Exception e) {
			e.getMessage();
		}
	  }
	
	//buscar por id
	public Optional<Produto_Venda> buscarPorID(int Codigo_produto_Venda) throws Exception {
		return Produto_VendaRepository.findById(Codigo_produto_Venda);
	    
	  }
	
	public List<Produto_Venda> BuscarTodos(){
		 return Produto_VendaRepository.findAll();
	}
	
	public void Deletar(int Codigo_Produto_Venda) throws Exception{
	    Produto_VendaRepository.deleteById(Codigo_Produto_Venda);
	   
	}

}
