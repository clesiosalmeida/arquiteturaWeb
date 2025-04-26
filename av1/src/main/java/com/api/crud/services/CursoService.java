package com.api.crud.services;

// Importações necessárias
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.models.Curso;
import com.api.crud.repositories.CursoRepository;

// Anotação que indica que esta classe é um serviço do Spring
@Service
public class CursoService {

    // Injeção de dependência do repositório de departamentos
    @Autowired
    private CursoRepository cursoRepository;

    // Método para buscar todos os departamentos
    public List<Curso> findAll() {
        // Chama o método findAll do repositório para obter todos os departamentos
        return cursoRepository.findAll();
    }

    // Método para buscar um departamento pelo ID
    public Optional<Curso> findById(Long id) {
        // Chama o método findById do repositório para obter um departamento pelo ID
        return cursoRepository.findById(id);
    }

    // Método para salvar um novo departamento ou atualizar um existente
    public Curso save(Curso curso) {
        // Chama o método save do repositório para salvar o departamento
        return cursoRepository.save(curso);
    }

    // Método para deletar um departamento pelo ID
    public void deleteById(Long id) {
        // Chama o método deleteById do repositório para deletar o departamento pelo ID
        cursoRepository.deleteById(id);
    }
}