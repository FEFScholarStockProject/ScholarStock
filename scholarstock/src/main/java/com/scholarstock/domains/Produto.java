package com.scholarstock.domains;

import java.util.Date;

import com.scholarstock.domains.enums.Situacao;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected int idProduto;

    protected String descricao;
    protected String quantidade;
    protected double valorProduto;
    protected String saldoEstoque;
    protected Date validade;
    protected Date dataFabricacao;
    protected String imagemProduto;
    protected String unidadeMedida;

    @ManyToOne
    @JoinColumn(name = "idGrupo")
    protected GrupoProduto grupoProduto;

    @Enumerated(EnumType.STRING)
    @JoinColumn(name="situacao")
    protected Situacao situacao;

    public Produto(){
        super();
        setSituacao(Situacao.ATIVO);
    }

    public Produto(int idProduto, String descricao, String quantidade, double valorProduto, String saldoEstoque,
            Date validade, Date dataFabricacao, String imagemProduto, String unidadeMedida) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorProduto = valorProduto;
        this.saldoEstoque = saldoEstoque;
        this.validade = validade;
        this.dataFabricacao = dataFabricacao;
        this.imagemProduto = imagemProduto;
        this.unidadeMedida = unidadeMedida;
        setSituacao(Situacao.ATIVO);
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getSaldoEstoque() {
        return saldoEstoque;
    }

    public void setSaldoEstoque(String saldoEstoque) {
        this.saldoEstoque = saldoEstoque;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getImagemProduto() {
        return imagemProduto;
    }

    public void setImagemProduto(String imagemProduto) {
        this.imagemProduto = imagemProduto;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    //Getters e Setters para GrupoProduto e Situacao

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public GrupoProduto getGrupoProduto() {
        return grupoProduto;
    }

    public void setGrupoProduto(GrupoProduto grupoProduto) {
        this.grupoProduto = grupoProduto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idProduto;
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
        Produto other = (Produto) obj;
        if (idProduto != other.idProduto)
            return false;
        return true;
    }

    
}
