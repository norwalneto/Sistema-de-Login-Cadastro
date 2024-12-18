package com.projeto.sistema_de_login_cadastro.dto;

public class ResponseDTO {

    private String status;
    private String mensagem;

    // Construtores
    public ResponseDTO(){}

    public ResponseDTO(String status, String mensagem) {
        this.status = status;
        this.mensagem = mensagem;
    }

    // Getters e Setters

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
