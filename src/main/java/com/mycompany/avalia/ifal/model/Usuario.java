/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avalia.ifal.model;

/**
 *
 * @author Ifal
 */
public class Usuario {
    protected String login;
    protected String senha;
    protected String nome;

    public Usuario(String login, String senha, String nome) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
    }

    public String getLogin() { return login; }
    public String getSenha() { return senha; }
    public String getNome()  { return nome; }

    // Cada filho pode dizer qual é o seu perfil
    public String getPerfil() { return "USUARIO"; }
}