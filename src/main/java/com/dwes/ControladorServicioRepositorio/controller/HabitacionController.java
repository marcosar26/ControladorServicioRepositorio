package com.dwes.ControladorServicioRepositorio.controller;

import com.dwes.ControladorServicioRepositorio.model.Habitacion;
import com.dwes.ControladorServicioRepositorio.service.HabitacionServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HabitacionController {
    private final HabitacionServ habitacionServ;

    @Autowired
    public HabitacionController(HabitacionServ habitacionServ) {
        this.habitacionServ = habitacionServ;
    }

    @GetMapping("/getHabitaciones")
    public ResponseEntity<List<Habitacion>> findAllByTipoAndPrecioLessThanEqual(
            @RequestParam String tipo,
            @RequestParam Double precio
    ) {
        List<Habitacion> habitaciones = habitacionServ.findAllByTipoAndPrecioLessThanEqual(tipo, precio);
        return habitaciones.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(habitaciones);
    }
}
