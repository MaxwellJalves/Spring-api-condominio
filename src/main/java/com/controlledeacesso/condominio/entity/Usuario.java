package com.controlledeacesso.condominio.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private String telefone;
    //private Veiculo veiculo;

    public Usuario(String n,String e,String t){
        this.nome     = n;
        this.email    = e;
        this.telefone = t;
    }
}
