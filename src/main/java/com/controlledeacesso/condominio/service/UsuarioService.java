package com.controlledeacesso.condominio.service;

import com.controlledeacesso.condominio.entity.Usuario;
import com.controlledeacesso.condominio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService implements UsuarioInterface {

    @Autowired
    private UsuarioRepository repository;

    public static List<Usuario> user = new ArrayList<>();

    @Override
    public Usuario created(Usuario us) {
        user.add(us);
        return us ;
    }

    @Override
    public List<Usuario> findAll() {
        return repository.findAll();
    }


    @Override
    public Usuario getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public List<Usuario> findBynome(String nome) {

        return repository.findByNome(nome);
    }

    @Override
    public void save(Usuario us) {
        repository.save(us);

    }


}
