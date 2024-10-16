package com.dwes.ControladorServicioRepositorio.service;

import com.dwes.ControladorServicioRepositorio.model.Cliente;
import com.dwes.ControladorServicioRepositorio.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> findByNombreAndApellidos(String nombre, String apellidos) {
        return clienteRepository.findByNombreAndApellidos(nombre, apellidos);
    }

    public List<Cliente> findByOficinaId(Long idOficina) {
        return clienteRepository.findByOficinaId(idOficina);
    }
}