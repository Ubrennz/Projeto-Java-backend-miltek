package com.projetomiltek.miltek.service;

import com.projetomiltek.miltek.model.EventoSanitario;
import com.projetomiltek.miltek.repositories.EventoSanitarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoSanitarioService {
    @Autowired
    private EventoSanitarioRepository eventoSanitarioRepository;

    public EventoSanitario findById(Long id) {
        Optional<EventoSanitario> eventoSanitario = eventoSanitarioRepository.findById(id);
        return eventoSanitario.get();
    }

    public List<EventoSanitario> findAll() {
        return eventoSanitarioRepository.findAll();
    }
}
