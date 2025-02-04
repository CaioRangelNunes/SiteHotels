package com.engsoft.hotel;

public record HotelRequestDTO(String title, double value, String description, String estate, String city, MultipartFile image, String adress){

}