package com.academia.tech.gymproject.services.impl;

import com.academia.tech.gymproject.models.UsuarioModel;
import com.academia.tech.gymproject.repositorys.UsuarioRepository;
import com.academia.tech.gymproject.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;


    @Override
    public UsuarioModel save(UsuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }

    @Override
    public Optional<UsuarioModel> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public List<UsuarioModel> findAll() {
        return usuarioRepository.findAll();
    }
}
