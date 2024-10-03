package com.dwes.ControladorServicioRepositorio.service;

import com.dwes.ControladorServicioRepositorio.dto.UserRequestDTO;
import com.dwes.ControladorServicioRepositorio.model.Usuario;
import com.dwes.ControladorServicioRepositorio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRequestDTO getUserDtoById(long id) {
        Usuario userEntity = userRepository.findFirstById(id);
        return UserRequestDTO.builder()
                .name(userEntity.getName())
                .lastname(userEntity.getLastname())
                .build();
    }

    public List<UserRequestDTO> getUserDtoByLastname(String lastname) {
        return userRepository.findByLastname(lastname)
                .stream()
                .map(this::mapToRequestDTO)
                .toList();
    }

    private UserRequestDTO mapToRequestDTO(Usuario usuario) {
        return UserRequestDTO.builder()
                .name(usuario.getName())
                .lastname(usuario.getLastname())
                .build();
    }
}
