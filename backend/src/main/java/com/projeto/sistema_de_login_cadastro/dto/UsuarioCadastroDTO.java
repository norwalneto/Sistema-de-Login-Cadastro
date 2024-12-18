package com.projeto.sistema_de_login_cadastro.dto;

public class UsuarioCadastroDTO {

    private String username;
    private String email;
    private String password;

    // Construtor padrão
    public UsuarioCadastroDTO() {
    }

    // Construtor com argumentos
    public UsuarioCadastroDTO(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getters e Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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
