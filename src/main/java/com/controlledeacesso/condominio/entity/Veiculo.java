package com.controlledeacesso.condominio.entity;

import lombok.*;

import javax.persistence.Entity;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Veiculo {

    private long id;
    private String placa;
    private String cor;
    private String modelo;
    private Usuario usuario;

}
