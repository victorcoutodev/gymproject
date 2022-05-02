package com.academia.tech.gymproject.dtos;

import com.academia.tech.gymproject.enums.TipoTreino;

public class TreinoDto {
    private String nome;
    private TipoTreino tipoTreino;
    private Long idProfessor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoTreino getTipoTreino() {
        return tipoTreino;
    }

    public void setTipoTreino(TipoTreino tipoTreino) {
        this.tipoTreino = tipoTreino;
    }

    public Long getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }
}
