package com.scholarstock.domains.enums;

public enum TipoRequisicao {

    RequisicaoEntrada(0,"Entrada"), RequisicaoSaida(1,"Saida");  

    private Integer id;
    private String tipoRequisicao;
    
    private TipoRequisicao(Integer id, String tipoRequisicao) {
        this.id = id;
        this.tipoRequisicao = tipoRequisicao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoRequisicao() {
        return tipoRequisicao;
    }

    public void setTipoRequisicao(String tipoRequisicao) {
        this.tipoRequisicao = tipoRequisicao;
    }

    public static TipoRequisicao toEnum(Integer id){
        if(id==null) return null;
        for(TipoRequisicao x : TipoRequisicao.values()){
            if(id.equals(x.getId())){
                return x;
            }
        }
        throw new IllegalArgumentException("Tipo da requisição não é valido.");
    }
}
