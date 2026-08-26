package com.example.atividade.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("professor")
@PrimaryKeyJoinColumn(name = "id_pessoa")
@Table(name = "professores")
public class Professor extends Pessoa {
    public Professor(){

    }

    public Professor(int idProfessor, String prontuario, String formacao){
        this.idProfessor = idProfessor;
        this.prontuario = prontuario;
        this.formacao = formacao;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

     //id
    @Column(name = "idProfessor")
    private int idProfessor;

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    //prontuario
    @Column(name = "prontuario")
    private String prontuario;

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    //formacao
    @Column(name = "formacao")
    private String formacao;

     public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

}
