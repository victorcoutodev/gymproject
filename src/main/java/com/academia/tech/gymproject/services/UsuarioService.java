package com.academia.tech.gymproject.services;

import com.academia.tech.gymproject.models.UsuarioModel;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    UsuarioModel save(UsuarioModel usuarioModel);

    Optional<UsuarioModel> findById(Long id);

    List<UsuarioModel> findAll();
}
