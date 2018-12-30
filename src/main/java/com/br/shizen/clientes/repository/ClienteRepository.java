package com.br.shizen.clientes.repository;

import com.br.shizen.clientes.domain.ClienteEntity;

import java.math.BigDecimal;
import java.util.Collection;

public interface ClienteRepository {

    String save(ClienteEntity clienteEntity);

    ClienteEntity findByEmail(String email);

    ClienteEntity findById(BigDecimal id);

    ClienteEntity findByAlias(BigDecimal id);

    Collection<ClienteEntity> findAll();

    void delete(String id);
}
