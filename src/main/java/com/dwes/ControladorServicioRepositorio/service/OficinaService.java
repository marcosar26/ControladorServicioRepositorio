package com.dwes.ControladorServicioRepositorio.service;

import com.dwes.ControladorServicioRepositorio.model.Oficina;
import com.dwes.ControladorServicioRepositorio.repository.OficinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OficinaService {
    private final OficinaRepository oficinaRepository;

    @Autowired
    public OficinaService(OficinaRepository oficinaRepository) {
        this.oficinaRepository = oficinaRepository;
    }

    public Oficina findById(Long id) {
        return oficinaRepository.findById(id).orElse(null);
    }

    public List<Oficina> findAll() {
        return oficinaRepository.findAll();
    }
}