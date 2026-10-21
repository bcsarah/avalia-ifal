
package com.mycompany.avalia.ifal.model;

public class Professor extends Usuario {

    private String matricula;

    public Professor() {
        super("prof", "1234", "Professor");
        this.matricula = "";
    }

    public Professor(String login, String senha, String nome,
                     String matricula, String cpf, boolean ativo) {
        super(login, senha, nome, cpf, ativo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getPerfil() {
        return "PROFESSOR";
    }

    @Override
    public String toString() {
        return nome + " - " + matricula;
    }
}
