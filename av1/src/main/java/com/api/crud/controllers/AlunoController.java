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

import com.api.crud.models.Aluno;
import com.api.crud.services.AlunoService;

// Anotação que indica que esta classe é um controlador REST
@RestController
// Define a rota base para todas as requisições deste controlador
@RequestMapping("/alunos")
public class AlunoController {
    // Injeção de dependência do serviço de funcionários
    @Autowired
    private AlunoService alunoService;

    // Método para obter todos os funcionários
    @GetMapping
    public List<Aluno> getAllAlunos() {
        // Chama o serviço para obter todos os funcionários
        return alunoService.findAll();
    }

    // Método para obter um funcionário pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Aluno> getAlunoById(@PathVariable Long id) {
        // Chama o serviço para obter um funcionário pelo ID
        Optional<Aluno> aluno = alunoService.findById(id);
        // Retorna o funcionário se encontrado, caso contrário, retorna 404 Not Found
        return aluno.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Método para criar um novo funcionário
    @PostMapping
    public Aluno createAluno(@RequestBody Aluno aluno) {
        // Chama o serviço para salvar o novo funcionário
        return alunoService.save(aluno);
    }

    // Método para atualizar um funcionário existente
    @PutMapping("/{id}")
    public ResponseEntity<Aluno> updateAluno(@PathVariable Long id, @RequestBody Aluno alunoDetails) {
        // Chama o serviço para obter um funcionário pelo ID
        Optional<Aluno> aluno = alunoService.findById(id);
        if (aluno.isPresent()) {
            // Atualiza os detalhes do funcionário
            Aluno updatedAluno = aluno.get();
            updatedAluno.setFirstName(alunoDetails.getFirstName());
            updatedAluno.setLastName(alunoDetails.getLastName());
            updatedAluno.setCurso(alunoDetails.getCurso());
            updatedAluno.setBirthdate(alunoDetails.getBirthdate());
            updatedAluno.setCv(alunoDetails.getCv());
            // Salva o funcionário atualizado e retorna 200 OK
            return ResponseEntity.ok(alunoService.save(updatedAluno));
        } else {
            // Retorna 404 Not Found se o funcionário não for encontrado
            return ResponseEntity.notFound().build();
        }
    }

    // Método para deletar um funcionário pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAluno(@PathVariable Long id) {
        // Chama o serviço para deletar o funcionário pelo ID
        alunoService.deleteById(id);
        // Retorna 204 No Content
        return ResponseEntity.noContent().build();
    }
}