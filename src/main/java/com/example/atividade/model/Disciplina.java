package com.example.atividade.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="disciplinas")
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDisciplina")
    private int idDisciplina;
    @Column(name = "nome")
    private String nome;
    @Column(name = "area")
    private String area;
    @Column(name = "cargaHoraria")
    private String cargaHoraria;
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;


    public int getIdDisciplina() {
        return idDisciplina;
    }
    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public int getIdCurso() {
        return curso != null ? curso.getIdCurso() : 0;
    }

    public void setIdCurso(int idCurso) {
        if (this.curso == null) {
            this.curso = new Curso();
        }

        this.curso.setIdCurso(idCurso);
    }


}
