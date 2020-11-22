package com.coisas_coisas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coisas_coisas.model.Produto;
import com.coisas_coisas.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository ProdutoRepository;
	
	//salvar
	public void Salvar(Produto Produto) {
	    try {
	    	ProdutoRepository.saveAndFlush(Produto);
	    		    	
	    }catch (Exception e) {
			e.getMessage();
		}
	  }
	
	//buscar por id
	public Optional<Produto> buscarPorID(int Codigo_produto) throws Exception {
		return ProdutoRepository.findById(Codigo_produto);
	    
	  }
	
	public List<Produto> BuscarTodos(){
		 return ProdutoRepository.findAll();
	}
	
	public void Deletar(int Codigo_Produto) throws Exception{
	    ProdutoRepository.deleteById(Codigo_Produto);
	   
	}
	
}
