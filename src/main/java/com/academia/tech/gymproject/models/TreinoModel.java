package com.academia.tech.gymproject.models;

import com.academia.tech.gymproject.enums.TipoTreino;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TreinoModel implements Serializable {

    private static final long serialVersionUID = 998178086281808188L;

    private Long id;
    private String nome;
    private TipoTreino tipoTreino;
    private LocalDate dataCriacao;
    private List<SerieModel> series = new ArrayList<SerieModel>();
    private UsuarioModel professor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<SerieModel> getSeries() {
        return series;
    }

    public void setSeries(List<SerieModel> series) {
        this.series = series;
    }

    public UsuarioModel getProfessor() {
        return professor;
    }

    public void setProfessor(UsuarioModel professor) {
        this.professor = professor;
    }
}
