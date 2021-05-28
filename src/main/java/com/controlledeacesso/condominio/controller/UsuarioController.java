package com.controlledeacesso.condominio.controller;

import com.controlledeacesso.condominio.controller.dto.request.UsuarioRequest;
import com.controlledeacesso.condominio.controller.dto.response.UsuarioResponse;
import com.controlledeacesso.condominio.entity.Usuario;
import com.controlledeacesso.condominio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService user;

    @GetMapping
    public List<UsuarioResponse> ListUsers(@RequestBody String nome){

        if(nome == null ){
          return  UsuarioResponse.convertListName(user.getByName(nome));
        }
          return  UsuarioResponse.convertList(user.findAll());
    }

    @GetMapping(path = "/{id}")
    public UsuarioResponse getUserId(@PathVariable Long id){
        return UsuarioResponse.convert(user.getById(id));
    }

}
