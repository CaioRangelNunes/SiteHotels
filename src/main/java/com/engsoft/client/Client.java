package com.engsoft.client;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Getters
@Setters
@Entity
@Table(name="client")
@AllArgsConstructor
@NoArgsConstructor
public class Client(){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    
    private String name;
    private long email;


}