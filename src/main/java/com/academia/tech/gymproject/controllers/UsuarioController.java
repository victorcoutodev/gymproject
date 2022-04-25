package com.academia.tech.gymproject.controllers;

import com.academia.tech.gymproject.dtos.UsuarioDto;
import com.academia.tech.gymproject.enums.StatusUsuario;
import com.academia.tech.gymproject.enums.TipoUsuario;
import com.academia.tech.gymproject.models.UsuarioModel;
import com.academia.tech.gymproject.services.UsuarioService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@RequestMapping("/usuarios") //mapeamento base para toda a classe
@CrossOrigin(origins = "*", maxAge = 3600)
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody UsuarioDto usuarioDto){
        var usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioDto,usuarioModel);
        usuarioModel.setTipoUsuario(TipoUsuario.ALUNO);
        usuarioModel.setStatusUsuario(StatusUsuario.ATIVO);
        usuarioModel.setDataCriacao(LocalDateTime.now(ZoneId.of("UTC")));
        usuarioModel.setDataAtualizacao(LocalDateTime.now(ZoneId.of("UTC")));
        usuarioModel.setAtivo(true);

        usuarioService.save(usuarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioModel);
    }


}
