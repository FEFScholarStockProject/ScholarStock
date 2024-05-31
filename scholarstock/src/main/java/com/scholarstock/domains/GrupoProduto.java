package com.scholarstock.domains;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.scholarstock.domains.dtos.GrupoProdutoDTO;
import com.scholarstock.domains.enums.Situacao;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "grupoproduto")
public class GrupoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @NotNull
    @Size(min=5, max=50)
    private String descricao;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name="situacao")
    private Situacao situacao;

    @JsonIgnore
    @OneToMany
    private List<Produto> produtos = new ArrayList<>();

    public GrupoProduto() {
        super();
        setSituacao(Situacao.ATIVO);
    }

    public GrupoProduto(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        setSituacao(Situacao.ATIVO);
    }

    public GrupoProduto(GrupoProdutoDTO objDto) {
        this.id = objDto.getId();
        this.descricao = objDto.getDescricao();
        setSituacao(Situacao.ATIVO);
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GrupoProduto other = (GrupoProduto) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
