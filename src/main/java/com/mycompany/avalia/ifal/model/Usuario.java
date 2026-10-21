package com.mycompany.avalia.ifal.model;

public class Usuario {

    protected String login;
    protected String senha;
    protected String nome;
    protected String cpf;
    protected boolean ativo;

    public Usuario(String login, String senha, String nome) {
        this(login, senha, nome, "", true);
    }

    public Usuario(String login, String senha, String nome,
                   String cpf, boolean ativo) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.ativo = ativo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getPerfil() {
        return "USUARIO";
    }

    public boolean autenticar(String login, String senha) {
        return ativo
                && this.login != null
                && this.senha != null
                && this.login.equals(login)
                && this.senha.equals(senha);
    }

    @Override
    public String toString() {
        return nome;
    }
}
