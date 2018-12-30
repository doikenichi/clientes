package com.br.shizen.clientes.resource;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClienteResource {

    private String alias;
    @NotNull
    private String nome;
    @NotNull
    private String email;

    public ClienteResource(String alias, @NotNull String nome, @NotNull String email) {
        this.alias = alias;
        this.nome = nome;
        this.email = email;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteResource that = (ClienteResource) o;
        return Objects.equals(alias, that.alias) &&
                nome.equals(that.nome) &&
                email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias, nome, email);
    }

    @Override
    public String toString() {
        return "ClienteResource{" +
                "alias='" + alias + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
