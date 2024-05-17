package com.scholarstock.domains;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.scholarstock.domains.enums.Situacao;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name = "grupoproduto")
public class GrupoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @NotNull
    @Size(min=5, max=50)
    private String descricao;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "situacoes")
    private Set<Integer> situacao = new HashSet<>();



    public GrupoProduto() { 
        super();
    }

    

    public GrupoProduto(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        addSituacao(Situacao.ATIVO);
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



    public Set<Situacao> getSituacao() {
        return situacao.stream().map(x -> Situacao.toEnum(x)).collect(Collectors.toSet());
    }

    public void addSituacao(Situacao situacao) {
        this.situacao.add(situacao.getId());
    }

}
