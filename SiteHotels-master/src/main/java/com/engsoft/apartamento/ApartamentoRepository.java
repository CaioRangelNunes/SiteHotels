package com.engsoft.apartamento;
import com.engsoft.apartamento.Apartamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartamentoRepository extends JpaRepository<Apartamento, UUID> {
   
}