package com.scholarstock.domains;

import com.scholarstock.domains.enums.Situacao;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.FetchType;

import java.util.HashSet;
import java.util.Set;

public class UnidadeReceptora {
    private Integer idEntidade;
    private String tipoDoacao;
    private String descricao;
    private double quantidadeDoada;
    private String unidadeMedida;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "situacao")
    private Set<Integer> situacao = new HashSet<>();

    public UnidadeReceptora(){
        super();
        addSituacao(Situacao.INATIVO);
        addSituacao(Situacao.ATIVO);
    }
    
    public UnidadeReceptora(Integer idEntidade, String tipoDoacao, String descricao, double quantidadeDoada,
            String unidadeMedida) {
        this.idEntidade = idEntidade;
        this.tipoDoacao = tipoDoacao;
        this.descricao = descricao;
        this.quantidadeDoada = quantidadeDoada;
        this.unidadeMedida = unidadeMedida;
        addSituacao(Situacao.INATIVO);
        addSituacao(Situacao.ATIVO);
    }

    public Integer getIdEntidade() {
        return idEntidade;
    }

    public void setIdEntidade(Integer idEntidade) {
        this.idEntidade = idEntidade;
    }

    public String getTipoDoacao() {
        return tipoDoacao;
    }

    public void setTipoDoacao(String tipoDoacao) {
        this.tipoDoacao = tipoDoacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQuantidadeDoada() {
        return quantidadeDoada;
    }

    public void setQuantidadeDoada(double quantidadeDoada) {
        this.quantidadeDoada = quantidadeDoada;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public void addSituacao(Situacao situacao) {
        this.situacao.add(situacao.getId());
    }



}
