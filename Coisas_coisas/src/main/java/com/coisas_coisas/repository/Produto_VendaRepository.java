package com.coisas_coisas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coisas_coisas.model.Produto_Venda;
@Repository
public interface Produto_VendaRepository extends JpaRepository<Produto_Venda, Integer> {

}
