package com.academia.tech.gymproject.services.impl;

import com.academia.tech.gymproject.models.UsuarioModel;
import com.academia.tech.gymproject.repositorys.UsuarioRepository;
import com.academia.tech.gymproject.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;


    @Override
    public UsuarioModel save(UsuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }
}
