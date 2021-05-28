package com.controlledeacesso.condominio.controller.dto.response;

import com.controlledeacesso.condominio.controller.dto.request.UsuarioRequest;
import com.controlledeacesso.condominio.entity.Usuario;
import com.controlledeacesso.condominio.service.UsuarioService;

import java.util.List;
import java.util.stream.Collectors;


public class UsuarioResponse {
    private String nome;
    private String email;
    private String telefone;
    public UsuarioResponse(){

    }
    public UsuarioResponse(Usuario us){
        this.nome = us.getNome();
        this.email = us.getEmail();
        this.telefone = us.getEmail();
    }
    public static UsuarioResponse convert(Usuario value) {
        UsuarioResponse response = new UsuarioResponse();
        response.nome = value.getNome();
        response.email = value.getEmail();
        response.telefone = value.getTelefone();
        return response;

    }

    public static List<UsuarioResponse> convertList(List<Usuario> listUser) {
            return listUser.stream().map(UsuarioResponse::new).collect(Collectors.toList());
    }

    public static List<UsuarioResponse> convertListName(List<Usuario> param) {
        return param.stream().map(UsuarioResponse::new).collect(Collectors.toList());
    }

    public String getNome() {
            return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
