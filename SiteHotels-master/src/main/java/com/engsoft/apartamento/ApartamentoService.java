package com.engsoft.apartamento;

import com.engsoft.apartamento.Apartamento;
import com.engsoft.apartamento.ApartamentoRequestDTO;
import org.springframework.stereotype.Service;
public class ApartamentoService {
    public Apartamento createApartamento(ApartamentoRequestDTO data){
        String imageurl=null;
        If(data.image!=null){
            imageurl=this.uploadImage(data.image);
        }
        Apartamento newApartamento=new Apartamento();
        newApartamento.setTitle(data.title());
        newApartamento.setValue(data.value());
        newApartamento.setQuantQuartos(data.quantQuartos());
        newApartamento.setQuantSuites(data.quantSuites());
        newApartamento.seTQUantSalaDeEstar(data.quantSalaDeEstar());
        newApartamento.seTQuantVagasGaragem(data.quantvagasGaragem);
        newApartamento.setArea(data.area());
        newApartamento.setIsArmario(data.isArmario());
        newApartamento.setDescription(data.description());
        newApartamento.setEstate(data.estate());
        newApartamento.setCity(data.city());
        newApartamento.setImageurl(this.imageurl);
        newApartamento.setRua(data.rua());
        newApartamento.setBairro(data.bairro());
        newApartamento.setAndar(data.andar);
        newApartamento.setValorCondo(data.valorCondo);
        newApartamento.setIsPortaria24hrs(data.isPortaria24hrs);
        return newApartamento;
    }
    private String uploadImage(MultipartFile multipartFile){
        //converter imagem
    }
    
    
}
