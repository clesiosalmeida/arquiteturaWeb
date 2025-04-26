package com.api.crud.services;

// Importações necessárias
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.models.Aluno;
import com.api.crud.repositories.AlunoRepository;

// Anotação que indica que esta classe é um serviço do Spring
@Service
public class AlunoService {

    // Injeção de dependência do repositório de funcionários
    @Autowired
    private AlunoRepository alunoRepository;

    // Método para buscar todos os funcionários
    public List<Aluno> findAll() {
        // Chama o método findAll do repositório para obter todos os funcionários
        return alunoRepository.findAll();
    }

    // Método para buscar um funcionário pelo ID
    public Optional<Aluno> findById(Long id) {
        // Chama o método findById do repositório para obter um funcionário pelo ID
        return alunoRepository.findById(id);
    }

    // Método para salvar um novo funcionário ou atualizar um existente
    public Aluno save(Aluno aluno) {
        // Chama o método save do repositório para salvar o funcionário
        return alunoRepository.save(aluno);
    }

    // Método para deletar um funcionário pelo ID
    public void deleteById(Long id) {
        // Chama o método deleteById do repositório para deletar o funcionário pelo ID
        alunoRepository.deleteById(id);
    }
}