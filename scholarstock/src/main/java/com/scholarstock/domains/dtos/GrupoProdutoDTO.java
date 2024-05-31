package com.scholarstock.domains.dtos;

import com.scholarstock.domains.GrupoProduto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class GrupoProdutoDTO {

    private Integer id;

    @NotNull(message = "O campo nome não pode ser nulo")
    @NotBlank(message = "O campo nome não pode ser vazio")
    private String descricao;

    public GrupoProdutoDTO(){}

    public GrupoProdutoDTO(GrupoProduto grupoProduto) {
        this.id = grupoProduto.getId();
        this.descricao = grupoProduto.getDescricao();
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
