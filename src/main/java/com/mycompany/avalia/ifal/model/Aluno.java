/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avalia.ifal.model;

/**
 *
 * @author Ifal
 */
public class Aluno extends Usuario {

    public Aluno() {
        super("aluno", "1234", "Aluno");
    }

    @Override
    public String getPerfil() { return "ALUNO"; }
}