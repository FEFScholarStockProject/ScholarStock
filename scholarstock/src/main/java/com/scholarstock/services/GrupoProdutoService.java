package com.scholarstock.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import com.scholarstock.domains.GrupoProduto;
import com.scholarstock.services.exceptions.DataIntegrityViolationException;
import com.scholarstock.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scholarstock.domains.dtos.GrupoProdutoDTO;
import com.scholarstock.repositories.GrupoProdutoRepository;

@Service
public class GrupoProdutoService {

    @Autowired
    private GrupoProdutoRepository grupoProdutoRepo;

    public List<GrupoProdutoDTO> findAll(){
        return grupoProdutoRepo.findAll().stream().map(GrupoProdutoDTO::new).collect(Collectors.toList());
    }

    public GrupoProduto findbyId(int id){
        Optional<GrupoProduto> obj = grupoProdutoRepo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id:"+id));
    }

    public GrupoProduto create(GrupoProdutoDTO objDto){
        objDto.setId(null);
        GrupoProduto newObj = new GrupoProduto(objDto);
        return grupoProdutoRepo.save(newObj);
    }

    public GrupoProduto update(int id, GrupoProdutoDTO objDto){
        objDto.setId(id);
        GrupoProduto oldObj = findbyId(id);
        oldObj = new GrupoProduto(objDto);
        return grupoProdutoRepo.save(oldObj);
    }

    public void delete(int id){
        GrupoProduto obj = findbyId(id);
        if (obj.getProdutos().isEmpty()){
            throw new DataIntegrityViolationException("Grupo Produto não pode ser deletado pois possui produtos!");
        }
        grupoProdutoRepo.deleteById(id);
    }
}
