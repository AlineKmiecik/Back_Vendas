package com.coisas_coisas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coisas_coisas.model.Venda;
@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer>{

}
