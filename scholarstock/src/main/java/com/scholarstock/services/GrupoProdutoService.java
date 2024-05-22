package com.scholarstock.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scholarstock.domains.dtos.GrupoProdutoDTO;
import com.scholarstock.repositories.GrupoProdutoRepository;

@Service
public class GrupoProdutoService {

    @Autowired
    private GrupoProdutoRepository grupoProdutoRepo;

    public List<GrupoProdutoDTO> findAll(){
        return grupoProdutoRepo.findAll().stream().map(obj -> new GrupoProdutoDTO(obj)).collect(Collectors.toList());
    }
}
