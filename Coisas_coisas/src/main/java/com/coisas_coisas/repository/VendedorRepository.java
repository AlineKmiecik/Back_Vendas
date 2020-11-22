package com.coisas_coisas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coisas_coisas.model.Vendedor;
@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {

}
