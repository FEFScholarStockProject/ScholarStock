package com.scholarstock.domains.dtos;

import com.scholarstock.domains.GrupoProduto;

public class GrupoProdutoDTO {

    private int id;
    private String descricao;

    public GrupoProdutoDTO(){}

    public GrupoProdutoDTO(GrupoProduto grupoProduto) {
        this.id = grupoProduto.getId();
        this.descricao = grupoProduto.getDescricao();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
