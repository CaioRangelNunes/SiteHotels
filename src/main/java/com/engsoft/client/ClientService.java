package com.engsoft.client;

import com.engsoft.client.Client;
import com.engsoft.client.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private RepositoryClient RepositoryClient;

    public List<Client> listarTodos() {
        return RepositoryClient.findAll();
    }
}
