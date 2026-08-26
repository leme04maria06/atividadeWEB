package com.example.atividade.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="disciplinas")
public class Disciplina {
    private int idDisciplina;
    private String nome;
    private String area;
    private String cargaHoraria;
    private Curso curso;


}
