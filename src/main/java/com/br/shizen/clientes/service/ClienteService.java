package com.br.shizen.clientes.service;

import com.br.shizen.clientes.repository.ClienteRepository;
import com.br.shizen.clientes.resource.ClienteResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public void addCliente(ClienteResource clienteResource){

    }
}
