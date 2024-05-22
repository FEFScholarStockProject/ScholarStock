package com.scholarstock.domains;

import com.scholarstock.domains.enums.Situacao;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class UnidadeReceptora {
    private Integer idEntidade;
    private String tipoDoacao;
    private String descricao;
    private double quantidadeDoada;
    private String unidadeMedida;

    @ManyToOne
    @JoinColumn(name="situacao")
    private Situacao situacao;

    public UnidadeReceptora(){
        super();
        setSituacao(Situacao.ATIVO);
    }
    
    public UnidadeReceptora(Integer idEntidade, String tipoDoacao, String descricao, double quantidadeDoada,
            String unidadeMedida) {
        this.idEntidade = idEntidade;
        this.tipoDoacao = tipoDoacao;
        this.descricao = descricao;
        this.quantidadeDoada = quantidadeDoada;
        this.unidadeMedida = unidadeMedida;
        setSituacao(Situacao.ATIVO);
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

    public Situacao geSituacao(){
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

}
