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
@Table(name = "alunos")
public class Aluno extends Pessoa{

    public Aluno(){

    }

    public Aluno(int idAluno, String prontuario, String nomeResponsavel, String telefoneResponsavel, Curso curso){
        this.idAluno = idAluno;
        this.prontuario = prontuario;
        this.nomeResponsavel = nomeResponsavel;
        this.telefoneResponsavel = telefoneResponsavel;
        this.curso = curso;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //id
    @Column(name = "idAluno")
    private int idAluno;

    public int getIdAluno() {
        return idAluno;
    }
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
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

    //nomeResponsavel
    @Column(name = "nomeResponsavel")
    private String nomeResponsavel;
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }
    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    @Column(name = "telefoneResponsavel")
    private String telefoneResponsavel;
    public String getTelefoneResponsavel(){
        return telefoneResponsavel;
    }
    public void setTelefoneResponsavel(String telefoneResponsavel){
        this.telefoneResponsavel = telefoneResponsavel;
    }

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

        public Integer getIdCurso() {
        if (curso != null)
            return curso.getIdCurso();
        return 0;
    }
    public void setIdCurso(Integer idCurso) {
        if (idCurso != null) {
            if (this.curso == null) {
                this.curso = new Curso();
            }
        this.curso.setIdCurso(idCurso);
        } 
        else {
            this.curso = null;
        }
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso idCurso) {
        this.curso = idCurso;
    }

}