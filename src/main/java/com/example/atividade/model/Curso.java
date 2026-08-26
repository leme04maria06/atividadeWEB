package com.example.atividade.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "cursos")
public class Curso {

    public Curso(){

    }

    public Curso(int idCurso, String nome, String duracao, String cargaHoraria){
        this.idCurso = idCurso;
        this.nome = nome;
        this.duracao = duracao;
        this.cargaHoraria = cargaHoraria;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCurso")
    private int idCurso;
    @Column(name = "nome")
    private String nome;
    @Column(name = "duracao")
    private String duracao;
    @Column(name = "cargaHoraria")
    private String cargaHoraria;

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
