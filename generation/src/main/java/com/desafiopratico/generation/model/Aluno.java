package com.desafiopratico.generation.model;

import javax.persistence.*;

@Entity
@Table(name = "Aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private double idade;
    private double notaprimeirosemestre;
    private double notasegundosemestre;
    private String nomeprofessor;
    private int numerosala;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double getNotaprimeirosemestre() {
        return notaprimeirosemestre;
    }

    public void setNotaprimeirosemestre(double notaprimeirosemestre) {
        this.notaprimeirosemestre = notaprimeirosemestre;
    }

    public double getNotasegundosemestre() {
        return notasegundosemestre;
    }

    public void setNotasegundosemestre(double notasegundosemestre) {
        this.notasegundosemestre = notasegundosemestre;
    }

    public String getNomeprofessor() {
        return nomeprofessor;
    }

    public void setNomeprofessor(String nomeprofessor) {
        this.nomeprofessor = nomeprofessor;
    }

    public int getNumerosala() {
        return numerosala;
    }

    public void setNumerosala(int numerosala) {
        this.numerosala = numerosala;
    }
}
