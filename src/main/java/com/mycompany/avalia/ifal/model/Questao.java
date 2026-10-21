
package com.mycompany.avalia.ifal.model;

import java.util.Objects;

public class Questao {

    private String enunciado;
    private String alternativaA;
    private String alternativaB;
    private String alternativaC;
    private String alternativaD;
    private String alternativaE;
    private String respostaCorreta;
    private String disciplina;
    private Professor professor;

    public Questao(String enunciado,
                   String alternativaA,
                   String alternativaB,
                   String alternativaC,
                   String alternativaD,
                   String alternativaE,
                   String respostaCorreta,
                   String disciplina,
                   Professor professor) {

        setEnunciado(enunciado);
        setAlternativaA(alternativaA);
        setAlternativaB(alternativaB);
        setAlternativaC(alternativaC);
        setAlternativaD(alternativaD);
        setAlternativaE(alternativaE);
        setRespostaCorreta(respostaCorreta);

        this.disciplina = disciplina;
        this.professor = professor;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = Objects.requireNonNull(enunciado);
    }

    public String getAlternativaA() {
        return alternativaA;
    }

    public void setAlternativaA(String alternativaA) {
        this.alternativaA = Objects.requireNonNull(alternativaA);
    }

    public String getAlternativaB() {
        return alternativaB;
    }

    public void setAlternativaB(String alternativaB) {
        this.alternativaB = Objects.requireNonNull(alternativaB);
    }

    public String getAlternativaC() {
        return alternativaC;
    }

    public void setAlternativaC(String alternativaC) {
        this.alternativaC = Objects.requireNonNull(alternativaC);
    }

    public String getAlternativaD() {
        return alternativaD;
    }

    public void setAlternativaD(String alternativaD) {
        this.alternativaD = Objects.requireNonNull(alternativaD);
    }

    public String getAlternativaE() {
        return alternativaE;
    }

    public void setAlternativaE(String alternativaE) {
        this.alternativaE = Objects.requireNonNull(alternativaE);
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        if (respostaCorreta == null
                || !respostaCorreta.matches("[A-E]")) {
            throw new IllegalArgumentException(
                    "A resposta correta deve ser A, B, C, D ou E."
            );
        }

        this.respostaCorreta = respostaCorreta;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getAlternativa(String letra) {
        if (letra == null) {
            throw new IllegalArgumentException(
                    "A letra da alternativa não pode ser nula."
            );
        }

        return switch (letra.toUpperCase()) {
            case "A" -> alternativaA;
            case "B" -> alternativaB;
            case "C" -> alternativaC;
            case "D" -> alternativaD;
            case "E" -> alternativaE;
            default -> throw new IllegalArgumentException(
                    "Alternativa inválida: " + letra
            );
        };
    }

    public boolean verificarResposta(String resposta) {
        return resposta != null
                && respostaCorreta.equalsIgnoreCase(resposta.trim());
    }

    @Override
    public String toString() {
        return enunciado;
    }
}
