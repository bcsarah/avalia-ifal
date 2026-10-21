
package com.mycompany.avalia.ifal.model;

import java.util.ArrayList;
import java.util.List;

public final class DadosIniciais {

    private DadosIniciais() {
        // Impede a criação de objetos dessa classe.
    }

    public static List<Usuario> criarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Admin(
                "admin", "1234", "Administrador", "", true
        ));

        usuarios.add(new Professor(
                "prof", "1234", "Professor Padrão",
                "1001", "", true
        ));

        usuarios.add(new Aluno(
                "aluno", "1234", "Aluno Padrão",
                "2026001", "", "Informática", true
        ));

        return usuarios;
    }
}