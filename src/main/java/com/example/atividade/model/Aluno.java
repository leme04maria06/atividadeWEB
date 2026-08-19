package com.example.atividade.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String prontuario;

    public Aluno(){

    }

    public Aluno(Long id, String prontuario){
        this.id = id;
        this.prontuario = prontuario;
    }

    public Long getId() {
        return id;
    }
    public void setIdAluno(Long id) {
        this.id = id;
    }
    public String getProntuario() {
        return prontuario;
    }
    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }


}
