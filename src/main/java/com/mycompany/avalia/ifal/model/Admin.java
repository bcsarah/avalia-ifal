
package com.mycompany.avalia.ifal.model;

public class Admin extends Usuario {

    public Admin() {
        super("admin", "1234", "Administrador");
    }

    public Admin(String login, String senha, String nome,
                 String cpf, boolean ativo) {
        super(login, senha, nome, cpf, ativo);
    }

    @Override
    public String getPerfil() {
        return "ADMIN";
    }
}
