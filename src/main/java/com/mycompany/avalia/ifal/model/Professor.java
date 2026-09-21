/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avalia.ifal.model;

/**
 *
 * @author Ifal
 */
public class Professor extends Usuario {

    public Professor() {
        super("prof", "1234", "Professor");
    }

    @Override
    public String getPerfil() { return "PROFESSOR"; }
}