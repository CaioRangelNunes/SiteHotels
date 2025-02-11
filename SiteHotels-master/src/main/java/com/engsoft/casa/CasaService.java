package com.engsoft.casa;

import com.engsoft.casa.Casa;
import com.engsoft.casa.CasaRequestDTO;
import org.springframework.stereotype.Service;
public class CasaService {
    public Casa createCasa(CasaRequestDTO data){
        String imageurl=null;
        If(data.image!=null){
            imageurl=this.uploadImage(data.image);
        }
        Casa newCasa=new Casa();
        newCasa.setTitle(data.title());
        newCasa.setValue(data.value());
        newCasa.setQuantQuartos(data.quantQuartos());
        newCasa.setQuantSuites(data.quantSuites());
        newCasa.seTQUantSalaDeEstar(data.quantSalaDeEstar());
        newCasa.seTQuantVagasGaragem(data.quantvagasGaragem);
        newCasa.setArea(data.area());
        newCasa.setIsArmario(data.isArmario());
        newCasa.setDescription(data.description());
        newCasa.setEstate(data.estate());
        newCasa.setCity(data.city());
        newCasa.setImageurl(this.imageurl);
        newCasa.setRua(data.rua());
        newCasa.setBairro(data.bairro());
        return newCasa;
    }
    private String uploadImage(MultipartFile multipartFile){
        //converter imagem
    }
    
    
}
