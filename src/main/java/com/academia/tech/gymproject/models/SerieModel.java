package com.academia.tech.gymproject.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_SERIES")
public class SerieModel implements Serializable
{

    private static final long serialVersionUID = -2823309616843331029L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private ExercicioModel exercicio;
    private Integer repeticoes;
    private Integer  qtdsExecucao;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TreinoModel treino;

}
