package com.br.shizen.clientes.controller;

import com.br.shizen.clientes.resource.ClienteResource;
import com.br.shizen.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("api/clientes/v1")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "create", produces = "application/json")
    public ResponseEntity<Void> createCliente(@Valid @RequestBody ClienteResource clienteResource) {

        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

}
