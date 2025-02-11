package com.engsoft.controller;

import com.engsoft.casa.Casa;
import com.engsoft.casa.CasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/casas")
public class Casa {

    @Autowired
    private CasaService casaService;

    @GetMapping
    public List<Casa> listarTodos() {
        return casa.listarTodos();
    }

    @PostMapping
    public Casa salvar(@RequestBody Casa casa) {
        return casa.salvar(Casa);
    }
    
    @GetMapping("/{id}")
    public Casa buscarPorId(@PathVariable Long id) {
        return casa.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        casa.deletar(id);
    }
    //add postMapping e entrada como postParam
    public ResponseEntity<Casa> create(@RequestBody CasaRequestDTO body) {
        Casa newCasa=this.CasaService.createCasa(body);
        return ResponseEntity.ok(newCasa);
    }
}