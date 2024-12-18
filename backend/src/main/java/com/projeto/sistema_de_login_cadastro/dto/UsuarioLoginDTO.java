package com.projeto.sistema_de_login_cadastro.dto;

public class UsuarioLoginDTO {

    private String email;
    private String password;

    // Construtor padrão
    public UsuarioLoginDTO() {
    }

    // Construtor com argumentos
    public UsuarioLoginDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getters e Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
