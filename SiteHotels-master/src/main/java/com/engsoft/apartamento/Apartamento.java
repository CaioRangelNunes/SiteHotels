package com.engsoft.apartamento;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Getters
@Setters
@Entity
@Table(name="apartamentos")
@AllArgsConstructor
@NoArgsConstructor
public class Hotel extends Imovel(){
    private int andar;
    private double valorCondo;
    private boolean isPortaria24hrs;

}