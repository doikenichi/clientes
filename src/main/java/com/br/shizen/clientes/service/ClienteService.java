package com.br.shizen.clientes.service;

import com.br.shizen.clientes.domain.ClienteEntity;
import com.br.shizen.clientes.repository.ClienteRepository;
import com.br.shizen.clientes.resource.ClienteResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class ClienteService {

    private static final Logger log = LoggerFactory.getLogger(ClienteService.class);

    @Autowired
    private ClienteRepository clienteRepository;

    public void addCliente(ClienteResource clienteResource) {
        log.debug("addCliente start");
        log.debug("clienteResource: " + clienteResource);
        long now = Calendar.getInstance().getTimeInMillis();
        log.debug("now: " + now);
        ClienteEntity clienteEntity = new ClienteEntity(clienteResource.getNome(), clienteResource.getEmail());

        ClienteEntity newClienteEntity = clienteRepository.save(clienteEntity);
        newClienteEntity.setAlias("C" + now + newClienteEntity.getId());


        log.debug("newClienteEntity: " + newClienteEntity);
        clienteRepository.save(newClienteEntity);
        log.debug("addCliente end");
    }
}
