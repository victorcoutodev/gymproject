package com.academia.tech.gymproject.models;

import com.academia.tech.gymproject.enums.TipoTreino;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TB_TREINOS")
public class TreinoModel implements Serializable {

    private static final long serialVersionUID = 998178086281808188L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private TipoTreino tipoTreino;
    private LocalDate dataCriacao;
    @OneToMany(mappedBy = "treino", fetch = FetchType.LAZY )
    @Fetch(FetchMode.SUBSELECT)
    private Set<SerieModel> series = new HashSet<>();
    @OneToOne
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

    public Set<SerieModel> getSeries() {
        return series;
    }

    public void setSeries(Set<SerieModel> series) {
        this.series = series;
    }

    public UsuarioModel getProfessor() {
        return professor;
    }

    public void setProfessor(UsuarioModel professor) {
        this.professor = professor;
    }
}
