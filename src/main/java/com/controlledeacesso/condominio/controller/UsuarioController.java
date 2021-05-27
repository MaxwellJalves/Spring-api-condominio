package com.controlledeacesso.condominio.controller;

import com.controlledeacesso.condominio.controller.dto.request.UsuarioRequest;
import com.controlledeacesso.condominio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService user;


    @GetMapping
    public List<UsuarioRequest> ListUsers(){
        return  UsuarioRequest.convert(user.findAll());
    }
}
