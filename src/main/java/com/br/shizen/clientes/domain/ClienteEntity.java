package com.br.shizen.clientes.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "CLIENTES")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private BigDecimal id;

    private String alias;
    private String nome;
    private String email;

    public ClienteEntity(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ClienteEntity{" +
                "id=" + id +
                ", alias='" + alias + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
