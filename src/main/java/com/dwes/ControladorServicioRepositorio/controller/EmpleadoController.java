package com.dwes.ControladorServicioRepositorio.controller;

import com.dwes.ControladorServicioRepositorio.model.Empleado;
import com.dwes.ControladorServicioRepositorio.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    private final EmpleadoService empleadoService;

    @Autowired
    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Empleado>> getAllEmpleados() {
        List<Empleado> empleados = empleadoService.findAll();
        return empleados.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(empleados);
    }

    @GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Empleado> getEmpleadoById(@PathVariable long id) {
        Empleado empleado = empleadoService.findFirstById(id);
        return empleado == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(empleado);
    }

    @GetMapping(value = "/telefono/{telefono}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Empleado> findFirstByTelefono(@PathVariable String telefono) {
        Empleado empleado = empleadoService.findFirstByTelefono(telefono);
        return empleado == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(empleado);
    }

    @GetMapping(value = "/apellido", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Empleado>> findAllByOrderByApellido() {
        List<Empleado> empleados = empleadoService.findAllByOrderByApellido();
        return empleados.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(empleados);
    }
}
