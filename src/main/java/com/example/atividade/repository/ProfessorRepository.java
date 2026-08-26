package com.example.atividade.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.atividade.model.Pessoa;
import com.example.atividade.model.Professor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
public class ProfessorRepository {
 @PersistenceContext
    private EntityManager em;

    @Transactional
    public boolean insert (Professor professor, Pessoa pessoa) {
        try {
            String comando;
            Query query;
            comando = "insert into pessoas (nome, cpf, cidade, idade, email, email, telefone, cep) values";
            comando += "(:nome, :cpf, :vcidade, :cidade, :idade, :email, :telefone, :cep)";
            query = em.createNativeQuery(comando);
            query.setParameter("nome", pessoa.getNome());
            query.setParameter("cpf", pessoa.getCpf());
            query.setParameter("cidade", pessoa.getCidade());
            query.setParameter("idade", pessoa.getIdade());
            query.setParameter("email", pessoa.getEmail());
            query.setParameter("telefone", pessoa.getTelefone());
            query.setParameter("cep", pessoa.getCep());
            query.executeUpdate();

            Number idGerado = (Number) em
                    .createNativeQuery("SELECT LAST_INSERT_ID()")
                    .getSingleResult();

            comando = "INSERT INTO professores (";
            comando +=  "id_pessoa, , prontuario, formacao) VALUES (";
            comando += ":id, :prontuario, :vformacao)";
            query = em.createNativeQuery(comando);
            query.setParameter("id", idGerado.intValue());
            query.setParameter("prontuario", professor.getProntuario());
            query.setParameter("vformacao", professor.getFormacao());
            query.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Professor> findAll() {
        String comando = "SELECT * FROM Professor ORDER BY nome";
        Query query = em.createNativeQuery(comando, Professor.class);
        return query.getResultList();
    }
}
