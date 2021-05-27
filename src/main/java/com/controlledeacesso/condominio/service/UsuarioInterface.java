package com.controlledeacesso.condominio.service;

import com.controlledeacesso.condominio.entity.Usuario;

import java.util.List;

public interface UsuarioInterface {

    public Usuario created(Usuario us);
    public List<Usuario> findAll();
    public boolean getByName(String nome);
}
