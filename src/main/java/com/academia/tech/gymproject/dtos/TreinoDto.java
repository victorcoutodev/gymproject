package com.academia.tech.gymproject.dtos;

import com.academia.tech.gymproject.enums.StatusUsuario;
import com.academia.tech.gymproject.enums.TipoUsuario;

import java.util.Date;

public class TreinoDto {
    private Long matricula;
    private TipoUsuario tipoUsuario;
    private StatusUsuario statusUsuario;
    private String nomealuno;
    private Date data;
    private String professor;
    private String treinoA;
    private String treinoB;
    private String treinoC;
    private String treinoD;
    private String treinoE;
    private String treinoF;

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public StatusUsuario getStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(StatusUsuario statusUsuario) {
        this.statusUsuario = statusUsuario;
    }

    public String getNomealuno() {
        return nomealuno;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getTreinoA() {
        return treinoA;
    }

    public void setTreinoA(String treinoA) {
        this.treinoA = treinoA;
    }

    public String getTreinoB() {
        return treinoB;
    }

    public void setTreinoB(String treinoB) {
        this.treinoB = treinoB;
    }

    public String getTreinoC() {
        return treinoC;
    }

    public void setTreinoC(String treinoC) {
        this.treinoC = treinoC;
    }

    public String getTreinoD() {
        return treinoD;
    }

    public void setTreinoD(String treinoD) {
        this.treinoD = treinoD;
    }

    public String getTreinoE() {
        return treinoE;
    }

    public void setTreinoE(String treinoE) {
        this.treinoE = treinoE;
    }

    public String getTreinoF() {
        return treinoF;
    }

    public void setTreinoF(String treinoF) {
        this.treinoF = treinoF;
    }
}
