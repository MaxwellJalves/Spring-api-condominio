package com.controlledeacesso.condominio;

import com.controlledeacesso.condominio.entity.Usuario;
import com.controlledeacesso.condominio.service.UsuarioService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class UsuarioServiceTest {

    @Autowired
    private UsuarioService user;

    Usuario us = new Usuario(10l,"Maxwell","max@gmail.com","4546546546");

    @Test
    public void createUser(){
    user.created(us);
    Assertions.assertTrue(!user.findAll().isEmpty());
    }

    @Test
    public void ListUsers(){
        Assertions.assertTrue(user.findAll() != null );
    }

    @Test
    public void getByName(){
        Assertions.assertFalse(user.getByName("Maxwell"));
    }


}
