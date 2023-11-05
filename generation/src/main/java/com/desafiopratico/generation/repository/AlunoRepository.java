package com.desafiopratico.generation.repository;

import com.desafiopratico.generation.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Aluno findById(long id);
}
