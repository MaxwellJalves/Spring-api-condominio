package com.controlledeacesso.condominio.entity;

import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegistroCondominio {

    private Long id;
    private Usuario usuario;
    private Veiculo veiculo;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    private List<RegistroCondominio> fluxoEntradaSaidaCondominio= new ArrayList<>();
}
