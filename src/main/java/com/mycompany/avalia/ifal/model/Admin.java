/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avalia.ifal.model;

/**
 *
 * @author Ifal
 */
public class Admin extends Usuario {

    public Admin() {
        super("admin", "1234", "Administrador");
    }

    @Override
    public String getPerfil() { return "ADMIN"; }
}