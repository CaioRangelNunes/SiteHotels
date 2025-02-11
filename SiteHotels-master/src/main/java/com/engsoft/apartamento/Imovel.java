
package com.engsoft.apartamento;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
public abstract class Imovel(){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String title;
    private double value;
    private int quantQuartos;
    private int quantSuites;
    private int quantSalaDeEstar;
    private int quantVagasGaragem;
    private int area;
    private boolean isArmario;
    private String descricao;
    private String estate;
    private String city;
    private String imageurl;
    private String bairro;
    private String rua;



    

    //add mais


}