package com.dio.live.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movimentacao {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Embeddable
    public class MovimentacaoId implements Serializable {
        private Long idMovimento;
        private Long idUsuario;
    }

    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    private Ocorrencia ocorrencia;
    private Calendario calendario;
}
