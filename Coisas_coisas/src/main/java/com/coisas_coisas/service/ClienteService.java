package com.coisas_coisas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coisas_coisas.model.Cliente;
import com.coisas_coisas.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository ClienteRepository;
	
	//salvar
	public void Salvar(Cliente Cliente) {
	    try {
	    	if(this.buscarPorCpf(Cliente.getcpf_cnpj()) == null) {
	    		ClienteRepository.saveAndFlush(Cliente);
	    	}else {
	    		throw new Exception("Cadastro já existe");
	    	}
	    	
	    }catch (Exception e) {
			e.getMessage();
		}
	  }
	
	//buscar por id
	public Cliente buscarPorCpf(String Cpf) throws Exception {
		List<Cliente> Clientes = this.BuscarTodos();
	    boolean clienteExiste = false;
		for (Cliente cliente : Clientes) {
			if(cliente.getcpf_cnpj().equalsIgnoreCase(Cpf)){
				clienteExiste = true;
				return cliente;
			}
		}
		return null;
	    
	  }
	
	public List<Cliente> BuscarTodos(){
		 return ClienteRepository.findAll();
	}
	
	public void DeletarCpf(String Cpf) throws Exception{
		
		try {
			Cliente cli = this.buscarPorCpf(Cpf);
	    	if(cli != null) {
	    		ClienteRepository.deleteById(cli.getCodigo_cliente());
	    	}else {
	    		throw new Exception("Cliente não encontrado");
	    	}
	    	
	    }catch (Exception e) {
			e.getMessage();
		}
	}
	
}
