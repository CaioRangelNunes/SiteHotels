package com.engsoft.client;
import com.exemplo.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryClient extends JpaRepository<Client, UUID> {
    // Métodos personalizados podem ser adicionados aqui
}