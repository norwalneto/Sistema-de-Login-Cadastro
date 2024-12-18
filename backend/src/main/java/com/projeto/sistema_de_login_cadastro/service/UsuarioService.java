package com.projeto.sistema_de_login_cadastro.service;

import com.projeto.sistema_de_login_cadastro.dto.ResponseDTO;
import com.projeto.sistema_de_login_cadastro.dto.UsuarioCadastroDTO;
import com.projeto.sistema_de_login_cadastro.dto.UsuarioLoginDTO;
import com.projeto.sistema_de_login_cadastro.model.Usuario;
import com.projeto.sistema_de_login_cadastro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    private  final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public ResponseDTO cadastrarUsuario(UsuarioCadastroDTO usuarioCadastroDTO) {
        if (usuarioRepository.existsByEmail(usuarioCadastroDTO.getEmail())) {
            return new ResponseDTO("erro", "Email já cadastrado.");
        }

        if (usuarioRepository.existsByUsername(usuarioCadastroDTO.getUsername())) {
            return new ResponseDTO("erro", "Username já cadastrado.");
        }

        Usuario novoUsuario = new Usuario();
        novoUsuario.setUsername(usuarioCadastroDTO.getUsername());
        novoUsuario.setEmail(usuarioCadastroDTO.getEmail());
        novoUsuario.setPassword(usuarioCadastroDTO.getPassword());

        usuarioRepository.save(novoUsuario);
        return new ResponseDTO("sucesso", "Usuário cadastrado com sucesso!");

    }

    public ResponseDTO loginUsuario(UsuarioLoginDTO usuarioLoginDTO) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findByEmail(usuarioLoginDTO.getEmail());

        if (usuarioOptional.isEmpty()) {
            return new ResponseDTO("erro", "Usuário não encontrado.");
        }

        Usuario usuario = usuarioOptional.get();
        if (!usuario.getPassword().equals(usuarioLoginDTO.getPassword())) {
            return new ResponseDTO("erro", "Senha incorreta.");
        }

        return new ResponseDTO("sucesso", "Login realizado com sucesso!");
    }
}
