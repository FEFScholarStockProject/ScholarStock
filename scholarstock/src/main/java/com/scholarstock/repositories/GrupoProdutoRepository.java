package com.scholarstock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scholarstock.domains.GrupoProduto;

@Repository
public interface GrupoProdutoRepository extends JpaRepository<GrupoProduto, Integer> {

    List<GrupoProduto> findByDescricao(String descricao);

}
