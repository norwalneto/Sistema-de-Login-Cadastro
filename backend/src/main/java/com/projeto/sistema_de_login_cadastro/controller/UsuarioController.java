package com.projeto.sistema_de_login_cadastro.controller;

import com.projeto.sistema_de_login_cadastro.dto.ResponseDTO;
import com.projeto.sistema_de_login_cadastro.dto.UsuarioCadastroDTO;
import com.projeto.sistema_de_login_cadastro.dto.UsuarioLoginDTO;
import com.projeto.sistema_de_login_cadastro.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<ResponseDTO> cadastrarUsuario(@RequestBody UsuarioCadastroDTO usuarioCadastroDTO) {
        ResponseDTO resposta = usuarioService.cadastrarUsuario(usuarioCadastroDTO);
        return ResponseEntity.ok(resposta);
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseDTO> loginUsuario(@RequestBody UsuarioLoginDTO usuarioLoginDTO) {
        ResponseDTO resposta = usuarioService.loginUsuario(usuarioLoginDTO);
        return ResponseEntity.ok(resposta);
    }
}
