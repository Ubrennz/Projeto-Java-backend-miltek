package com.projetomiltek.miltek.service;

import com.projetomiltek.miltek.model.Usuario;
import com.projetomiltek.miltek.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario findById(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.get();
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
}
