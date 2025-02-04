package com.engsoft.hotel;
import com.engsoft.hotel.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryHotel extends JpaRepository<Hotel, UUID> {
    // Métodos personalizados podem ser adicionados aqui
}