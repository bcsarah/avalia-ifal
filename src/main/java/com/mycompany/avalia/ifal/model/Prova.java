
package com.mycompany.avalia.ifal.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Prova {

    private String titulo;
    private String disciplina;
    private Professor professor;
    private final List<Questao> questoes;
    private int duracaoMinutos;
    private boolean ativa;

    public Prova(String titulo, String disciplina,
                 Professor professor, int duracaoMinutos) {
        this.titulo = Objects.requireNonNull(titulo);
        this.disciplina = disciplina;
        this.professor = professor;
        this.questoes = new ArrayList<>();
        setDuracaoMinutos(duracaoMinutos);
        this.ativa = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = Objects.requireNonNull(titulo);
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

    public List<Questao> getQuestoes() {
        return Collections.unmodifiableList(questoes);
    }

    public void adicionarQuestao(Questao questao) {
        questoes.add(Objects.requireNonNull(questao));
    }

    public boolean removerQuestao(Questao questao) {
        return questoes.remove(questao);
    }

    public void limparQuestoes() {
        questoes.clear();
    }

    public int getQuantidadeQuestoes() {
        return questoes.size();
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        if (duracaoMinutos <= 0) {
            throw new IllegalArgumentException(
                    "A duração deve ser maior que zero."
            );
        }

        this.duracaoMinutos = duracaoMinutos;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public String toString() {
        return titulo + " - " + disciplina;
    }
}
