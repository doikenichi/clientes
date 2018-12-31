package com.br.shizen.clientes.repository;

import com.br.shizen.clientes.domain.ClienteEntity;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.Collection;

public interface ClienteRepository extends CrudRepository<ClienteEntity, BigDecimal> {

    ClienteEntity findByEmail(String email);

    ClienteEntity findByAlias(BigDecimal id);

    Collection<ClienteEntity> findAll();

}
