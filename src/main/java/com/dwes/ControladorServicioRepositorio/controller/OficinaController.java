package com.dwes.ControladorServicioRepositorio.controller;

import com.dwes.ControladorServicioRepositorio.model.Oficina;
import com.dwes.ControladorServicioRepositorio.service.OficinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/oficinas")
public class OficinaController {
    private final OficinaService oficinaService;

    @Autowired
    public OficinaController(OficinaService oficinaService) {
        this.oficinaService = oficinaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Oficina> getOficinaById(@PathVariable Long id) {
        Oficina oficina = oficinaService.findById(id);
        return oficina == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(oficina);
    }

    @GetMapping
    public List<Oficina> getAllOficinas() {
        return oficinaService.findAll();
    }
}
