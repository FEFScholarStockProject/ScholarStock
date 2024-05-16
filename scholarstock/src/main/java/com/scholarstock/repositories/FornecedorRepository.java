package com.scholarstock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scholarstock.domains.Fornecedor;


@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{
    
    List<Fornecedor> findByCnpj(String cnpj);
}
