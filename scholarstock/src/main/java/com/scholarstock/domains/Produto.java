package com.scholarstock.domains;

import java.util.Date;

public class Produto {

    protected int idProduto;
    protected String descricao;
    protected String quantidade;
    protected double valorProduto;
    protected String saldoEstoque;
    protected Date validade;
    protected Date dataFabricacao;
    protected String imagemProduto;
    protected String unidadeMedida;

    public Produto(){

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
