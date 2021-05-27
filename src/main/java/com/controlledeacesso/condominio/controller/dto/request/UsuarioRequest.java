package com.controlledeacesso.condominio.controller.dto.request;

import com.controlledeacesso.condominio.entity.Usuario;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class UsuarioRequest {
    private String nome;
    private String email;
    private String telefone;

public UsuarioRequest(Usuario us){
    this.nome =us.getNome();
    this.email = us.getEmail();
    this.telefone = us.getTelefone();
}

public static UsuarioRequest of (Usuario us){
        UsuarioRequest usuario = new UsuarioRequest();
        usuario.setNome(us.getNome());
        usuario.setEmail(us.getEmail());
        usuario.setTelefone(us.getTelefone());

        return usuario;
    }


    public static   List<UsuarioRequest> convert (List<Usuario> all) {
           return  all.stream().map(UsuarioRequest::new).collect(Collectors.toList());

    }
}
