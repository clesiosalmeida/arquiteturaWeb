package com.api.crud.repositories;

// Importações necessárias
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crud.models.Aluno;

// Anotação que indica que esta interface é um repositório do Spring
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    // Esta interface herda métodos de JpaRepository para operações CRUD
    // Não é necessário adicionar métodos adicionais aqui, a menos que você precise de consultas personalizadas
}