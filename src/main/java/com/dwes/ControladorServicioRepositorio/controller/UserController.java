package com.dwes.ControladorServicioRepositorio.controller;

import com.dwes.ControladorServicioRepositorio.dto.UserRequestDTO;
import com.dwes.ControladorServicioRepositorio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserRequestDTO> getUserById(@PathVariable long id) {
        UserRequestDTO userRequestDTO = userService.getUserDtoById(id);
        return ResponseEntity.ok(userRequestDTO);
    }

    @GetMapping(value = "/apellido/{lastname}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserRequestDTO>> getUserByLastname(@PathVariable String lastname) {
        List<UserRequestDTO> usuarios = userService.getUserDtoByLastname(lastname);
        return usuarios.isEmpty() ?
                ResponseEntity.notFound().build() :
                ResponseEntity.ok(usuarios);
    }
}
