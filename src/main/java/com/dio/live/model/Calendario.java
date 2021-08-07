package com.dio.live.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Calendario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
