package com.example.atividade.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Entity
@Inheritance(strategy =  InheritanceType.JOINED)
@Data
@Table(name="Pessoas")
public class Pessoa {

    public Pessoa(){

    }

    public Pessoa(int id, String nome, String cpf, int idade, String email, String telefone, String cidade, String cep){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.cidade = cidade;
        this.cep = cep;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //id
    @Column(name = "id")
    private int id;
    public int getId(){
    return id;
    }
    public void setId(int id){
    this.id = id;
    }
    
    //nome
    @Column(name = "nome")
    private String nome;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
    this.nome = nome;
    }

    //cpf
    @Column(name = "cpf")
    private String cpf;
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
    this.cpf = cpf;
    }

    //idade
    @Column(name = "idade")
    private int idade;
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
    this.idade = idade;
    }

    //email
    @Column(name = "email")
    private String email;
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
    this.email = email;
    }


    //telefone
    @Column(name = "telefone")
    private String telefone;
    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
    this.telefone = telefone;
    }

    //cidade

    @Column(name = "cidade")
    private String cidade;
    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
    this.cidade = cidade;
    }
 
    //cep
    @Column(name = "cep")
    private String cep;
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
}