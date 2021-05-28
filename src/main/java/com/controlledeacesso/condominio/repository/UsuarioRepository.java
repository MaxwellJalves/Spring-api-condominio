package com.controlledeacesso.condominio.repository;

import com.controlledeacesso.condominio.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    List<Usuario> getByNome(String nome);
}
