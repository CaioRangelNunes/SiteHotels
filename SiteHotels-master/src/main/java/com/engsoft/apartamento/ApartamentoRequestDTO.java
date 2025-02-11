package com.engsoft.apartamento;

public record ApartamentoRequestDTO(String title, double value, int quantQuartos, 
                            int quantSuites, int quantSalaDeEstar, int quantVagasGaragem,
                            int area, boolean isArmario, String description,  
                            String estate, String city, MultipartFile image, 
                            String bairro, String rua, int andar, double valorCondo, 
                            boolean isPortaria24hrs){

}