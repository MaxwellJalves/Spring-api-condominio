package com.controlledeacesso.condominio.repository;

import com.controlledeacesso.condominio.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
