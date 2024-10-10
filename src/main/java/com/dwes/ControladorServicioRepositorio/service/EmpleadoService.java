package com.dwes.ControladorServicioRepositorio.service;

import com.dwes.ControladorServicioRepositorio.model.Empleado;
import com.dwes.ControladorServicioRepositorio.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    private final EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    public Empleado findFirstById(long id) {
        return empleadoRepository.findFirstById(id);
    }

    public Empleado findFirstByTelefono(String telefono) {
        return empleadoRepository.findFirstByTelefono(telefono);
    }

    public List<Empleado> findAllByOrderByApellido() {
        return empleadoRepository.findAllByOrderByApellido();
    }
}
