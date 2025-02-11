package com.engsoft.controller;

import com.engsoft.apartamento.Apartamento;
import com.engsoft.apartamento.ApartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apartamentos")
public class Apartamento {

    @Autowired
    private ApartamentoService apartamentoService;

    @GetMapping
    public List<Apartamento> listarTodos() {
        return apartamento.listarTodos();
    }

    @PostMapping
    public Apartamento salvar(@RequestBody Apartamento apartamento) {
        return apartamento.salvar(Apartamento);
    }
    
    @GetMapping("/{id}")
    public Apartamento buscarPorId(@PathVariable Long id) {
        return apartamento.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        apartamento.deletar(id);
    }
    //add postMapping e entrada como postParam
    public ResponseEntity<Apartamento> create(@RequestBody ApartamentoRequestDTO body) {
        Apartamento newApartamento=this.apartamentoService.createApartamento(body);
        return ResponseEntity.ok(newApartamento);
    }
}