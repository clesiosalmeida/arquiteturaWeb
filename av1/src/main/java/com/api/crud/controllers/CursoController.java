package com.api.crud.controllers;

// Importações necessárias
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud.models.Curso;
import com.api.crud.services.CursoService;

// Anotação que indica que esta classe é um controlador REST
@RestController
// Define a rota base para todas as requisições deste controlador
@RequestMapping("/cursos")
public class CursoController {
    // Injeção de dependência do serviço de departamentos
    @Autowired
    private CursoService cursoService;

    // Método para obter todos os departamentos
    @GetMapping
    public List<Curso> getAllCursos() {
        // Chama o serviço para buscar todos os departamentos
        return cursoService.findAll();
    }

    // Método para obter um departamento pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Curso> getCursoById(@PathVariable Long id) {
        // Chama o serviço para buscar o departamento pelo ID
        Optional<Curso> curso = cursoService.findById(id);
        // Retorna o departamento se encontrado, caso contrário retorna 404 Not Found
        return curso.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Método para criar um novo departamento
    @PostMapping
    public Curso createCurso(@RequestBody Curso curso) {
        // Chama o serviço para salvar o novo departamento
        return cursoService.save(curso);
    }

    // Método para atualizar um departamento existente
    @PutMapping("/{id}")
    public ResponseEntity<Curso> updateCurso(@PathVariable Long id, @RequestBody Curso cursoDetails) {
        // Chama o serviço para buscar o departamento pelo ID
        Optional<Curso> curso = cursoService.findById(id);
        if (curso.isPresent()) {
            // Atualiza os detalhes do departamento
            Curso updatedCurso = curso.get();
            updatedCurso.setTitle(cursoDetails.getTitle());
            // Salva o departamento atualizado e retorna 200 OK
            return ResponseEntity.ok(cursoService.save(updatedCurso));
        } else {
            // Retorna 404 Not Found se o departamento não for encontrado
            return ResponseEntity.notFound().build();
        }
    }

    // Método para deletar um departamento pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurso(@PathVariable Long id) {
        // Chama o serviço para deletar o departamento pelo ID
        cursoService.deleteById(id);
        // Retorna 204 No Content após a exclusão
        return ResponseEntity.noContent().build();
    }
}