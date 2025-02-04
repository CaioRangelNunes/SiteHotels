package com.engsoft.hotel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Getters
@Setters
@Entity
@Table(name="hotels")
@AllArgsConstructor
@NoArgsConstructor
public class Hotel(){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    
    private String title;
    private double value;
    private String descricao;
    private String estate;
    private String city;
    private String imageurl;
    private String adress;

    

    //add mais


}