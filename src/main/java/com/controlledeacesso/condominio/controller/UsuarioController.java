package com.controlledeacesso.condominio.controller;

import com.controlledeacesso.condominio.controller.dto.request.UsuarioRequest;
import com.controlledeacesso.condominio.controller.dto.response.UsuarioResponse;
import com.controlledeacesso.condominio.entity.Usuario;
import com.controlledeacesso.condominio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService user;

    @GetMapping
    public List<UsuarioResponse> ListUsers(String nome){
        if(nome == null){
            return  UsuarioResponse.convertList(user.findAll());
        }else{
            return UsuarioResponse.converGetName(user.findBynome(nome));
        }
    }

    @GetMapping(path = "/{id}")
    public UsuarioResponse getUserId(@PathVariable Long id){
        return UsuarioResponse.convert(user.getById(id));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UsuarioResponse> salvar (@RequestBody UsuarioResponse us){
        user.save(us.getUsuarioConvert());
        return new ResponseEntity(us.getUsuarioConvert(), HttpStatus.CREATED);
    }
}
