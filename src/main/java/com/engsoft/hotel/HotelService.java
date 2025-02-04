package com.engsoft.hotel;

import com.engsoft.hotel.Hotel;
import com.engsoft.hotel.EventRequestDTO
import org.springframework.stereotype.Service;

@Service
public class HotelService {
    public Hotel createHotel(EventRequestDTO data){
        String imageurl=null;
        If(data.image!=null){
            imageurl=this.uploadImage(data.image);
        }
        Hotel newHotel=new Hotel();
        newHotel.setTitle(data.title());
        newHotel.setValue(data.value());
        newHotel.setDescription(data.description());
        newHotel.setEstate(data.estate());
        newHotel.setCity(data.city());
        newHotel.setImageurl(this.imageurl);
        newHotel.setAdress(this.adress);
        return newHotel;
    }
    private String uploadImage(MultipartFile multipartFile){
        //converter imagem
    }
    
    
}
