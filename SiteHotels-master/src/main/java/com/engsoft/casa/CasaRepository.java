package com.engsoft.casa;
import com.engsoft.casa.Casa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CasaRepository extends JpaRepository<Casa, UUID> {
   
}