package com.academia.tech.gymproject.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/modalidade") //mapeamento base para toda a classe
@CrossOrigin(origins = "*", maxAge = 3600)
public class ModalidadeController {
}
