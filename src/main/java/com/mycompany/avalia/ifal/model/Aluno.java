
package com.mycompany.avalia.ifal.model;

public class Aluno extends Usuario {

    private String matricula;
    private String turma;

    public Aluno() {
        super("aluno", "1234", "Aluno");
        this.matricula = "";
        this.turma = "";
    }

    public Aluno(String login, String senha, String nome,
                 String matricula, String cpf, String turma,
                 boolean ativo) {
        super(login, senha, nome, cpf, ativo);
        this.matricula = matricula;
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String getPerfil() {
        return "ALUNO";
    }

    @Override
    public String toString() {
        return nome + " - " + matricula;
    }
}
