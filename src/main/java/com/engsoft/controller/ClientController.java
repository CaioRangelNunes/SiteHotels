package com.engsoft.controller;

import com.engsoft.client.Client;
import com.engsoft.client.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    

    @PostMapping
    public Client salvar(@RequestBody Client client) {
        return this.clientService.salvar(client);
    }
    //dps mudar, para n pegar pela barra
    @GetMapping("/{id}")
    public Client buscarPorId(@PathVariable Long id) {
        return this.clientService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        this.clientService.deletar(id);
    }
}