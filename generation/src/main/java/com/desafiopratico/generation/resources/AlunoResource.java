package com.desafiopratico.generation.resources;

import com.desafiopratico.generation.model.Aluno;
import com.desafiopratico.generation.repository.AlunoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")

public class AlunoResource {
    public final AlunoRepository alunoRepository;

    @Autowired
    public AlunoResource (AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping("/alunos")
    @ApiOperation(value="Retorna a lista de alunos")
    public List<Aluno> listaAlunos() {
        return alunoRepository.findAll();
    }

    @GetMapping("/aluno/{id}")
    @ApiOperation(value="Retorna um único aluno")
    public Aluno listaAlunoEspecifico(@PathVariable(value="id") long id) {
        return alunoRepository.findById(id);

    }

    @PostMapping ("/aluno")
    @ApiOperation(value="Salva um aluno")
    public Aluno salvaAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @DeleteMapping ("/aluno")
    @ApiOperation(value="Deleta um aluno")
    public void deletaAluno(@RequestBody Aluno aluno) {
        alunoRepository.delete(aluno);
    }

    @PutMapping ("/aluno")
    @ApiOperation(value="Atualiza um aluno")
    public Aluno atualizaAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}
