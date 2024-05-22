package com.scholarstock.domains.enums;

public enum TipoMovimento {
    COMPRA(0, "COMPRA"), CONSUMO(1, "CONSUMO"), ACERTO_ESTOQUE(2, "ACERTO_ESTOQUE"), DOACAO(3, "DOACAO");

    private Integer id;
    private String tipoMovimento;

    private TipoMovimento(Integer id, String tipoMovimento) {
        this.id = id;
        this.tipoMovimento = tipoMovimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public static TipoMovimento toEnum(Integer id) {
        if (id == null)
            return null;
        for (TipoMovimento x : TipoMovimento.values()) {
            if (id.equals(x.getId())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Movimento Invalido");
    }
}
