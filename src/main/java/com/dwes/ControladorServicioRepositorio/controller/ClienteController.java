package com.dwes.ControladorServicioRepositorio.controller;

import com.dwes.ControladorServicioRepositorio.model.Cliente;
import com.dwes.ControladorServicioRepositorio.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/buscar")
    public List<Cliente> getClientesByNombreAndApellidos(
            @RequestParam String nombre,
            @RequestParam String apellidos) {
        return clienteService.findByNombreAndApellidos(nombre, apellidos);
    }

    @GetMapping("/oficina/{id}")
    public List<Cliente> getClientesByOficina(@PathVariable Long id) {
        return clienteService.findByOficinaId(id);
    }
}
