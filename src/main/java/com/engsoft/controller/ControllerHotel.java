package com.engsoft.controller;

import com.engsoft.imoveis.DadosImoveis;
import com.engsoft.service.DadosImoveis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class DadosImoveis {

    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<DadosImoveis> listarTodos() {
        return dadosImoveis.listarTodos();
    }

    @PostMapping
    public DadosImoveis salvar(@RequestBody DadosImoveis DadosImoveis) {
        return dadosImoveis.salvar(DadosImoveis);
    }
    
    @GetMapping("/{id}")
    public DadosImoveis buscarPorId(@PathVariable Long id) {
        return dadosImoveis.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        dadosImoveis.deletar(id);
    }
    //add postMapping e entrada como postParam
    public ResponseEntity<Hotel> create(@RequestBody HotelRequestDTO body) {
        Hotel newHotel=this.hotelService.createHotel(body);
        return ResponseEntity.ok(newHotel);
    }
}