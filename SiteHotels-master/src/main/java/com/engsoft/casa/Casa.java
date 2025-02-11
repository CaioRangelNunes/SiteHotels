package com.engsoft.casa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import com.engsoft.apartamento.Imovel;
@Getters
@Setters
@Entity
@Table(name="casas")
@AllArgsConstructor
@NoArgsConstructor
public class Casa extends Imovel(){

}