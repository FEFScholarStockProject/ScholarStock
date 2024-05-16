package com.scholarstock.domains;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.scholarstock.domains.enums.Situacao;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    @Column (unique = true)
    private String cnpj;

    @Column
    private String razaoSocial;
    private String nomeFantasia;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;

    @Column(unique = true)
    private int telefone;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "situacao")
    private Set<Integer> situacao = new HashSet<>();


    public Fornecedor() { 
        super();
        addSituacao(Situacao.ATIVO);
    }


    public Fornecedor(Long id, @NotNull String cnpj, String razaoSocial, String nomeFantasia, String endereco,
            String cidade, String estado, String cep, int telefone) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        addSituacao(Situacao.ATIVO);
    }

    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }


    public String getCnpj() {
        return cnpj;
    }


    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public String getRazaoSocial() {
        return razaoSocial;
    }


    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }


    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getCep() {
        return cep;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }


    public int getTelefone() {
        return telefone;
    }


    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Set<Situacao> getSituacao() {
        return situacao.stream().map(x -> Situacao.toEnum(x)).collect(Collectors.toSet());
    }

    public void addSituacao(Situacao situacao) {
        this.situacao.add(situacao.getId());
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
        result = prime * result + telefone;
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
        Fornecedor other = (Fornecedor) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (cnpj == null) {
            if (other.cnpj != null)
                return false;
        } else if (!cnpj.equals(other.cnpj))
            return false;
        if (telefone != other.telefone)
            return false;
        return true;
    }

}
