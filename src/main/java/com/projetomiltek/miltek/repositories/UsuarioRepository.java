package com.projetomiltek.miltek.repositories;

import com.projetomiltek.miltek.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
