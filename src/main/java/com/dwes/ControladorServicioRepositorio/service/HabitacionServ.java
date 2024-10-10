package com.dwes.ControladorServicioRepositorio.service;

import com.dwes.ControladorServicioRepositorio.model.Habitacion;
import com.dwes.ControladorServicioRepositorio.repository.HabitacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitacionServ {
    private final HabitacionRepo habitacionRepo;

    @Autowired
    public HabitacionServ(HabitacionRepo habitacionRepo) {
        this.habitacionRepo = habitacionRepo;
    }

    public List<Habitacion> findAllByTipoAndPrecioLessThanEqual(String tipo, double precio) {
        return habitacionRepo.findAllByTipoAndPrecioLessThanEqual(tipo, precio);
    }
}
