package com.coisas_coisas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coisas_coisas.model.Vendedor;
import com.coisas_coisas.repository.VendedorRepository;

@Service
public class VendedorService {
	
	@Autowired
	private VendedorRepository VendedorRepository;
	
	//salvar
	public void Salvar(Vendedor Vendedor) {
	    try {
	    	if(this.buscarPorCpf(Vendedor.getCpf()) == null) {
	    		VendedorRepository.saveAndFlush(Vendedor);
	    	}else {
	    		throw new Exception("Cadastro já existe");
	    	}
	    	
	    }catch (Exception e) {
			e.getMessage();
		}
	  }
	
	//buscar por id
	public Vendedor buscarPorCpf(String Cpf) throws Exception {
		List<Vendedor> Vendedors = this.BuscarTodos();
	    boolean VendedorExiste = false;
		for (Vendedor Vendedor : Vendedors) {
			if(Vendedor.getCpf().equalsIgnoreCase(Cpf)){
				VendedorExiste = true;
				return Vendedor;
			}
		}
		return null;
	    
	  }
	
	public List<Vendedor> BuscarTodos(){
		 return VendedorRepository.findAll();
	}
	
	public void DeletarCpf(String Cpf) throws Exception{
		
		try {
			Vendedor vend = this.buscarPorCpf(Cpf);
	    	if(vend != null) {
	    		VendedorRepository.deleteById(vend.getCodigo_funcionario());
	    	}else {
	    		throw new Exception("Vendedor não encontrado");
	    	}
	    	
	    }catch (Exception e) {
			e.getMessage();
		}
	}

}
