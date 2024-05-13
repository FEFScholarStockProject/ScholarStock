package com.scholarstock.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scholarstock.domains.GrupoProduto;
import com.scholarstock.repositories.GrupoProdutoRepository;

@Service
public class DBService {

    @Autowired
    private GrupoProdutoRepository grupoProdutoRepo;

    public void initDB(){
        GrupoProduto grupoProduto01 = new GrupoProduto(0,"Grupo 01");
        grupoProdutoRepo.save(grupoProduto01);

        GrupoProduto grupoProduto02 = new GrupoProduto(0, "Grupo 02");
        grupoProdutoRepo.save(grupoProduto02);

    }

}
