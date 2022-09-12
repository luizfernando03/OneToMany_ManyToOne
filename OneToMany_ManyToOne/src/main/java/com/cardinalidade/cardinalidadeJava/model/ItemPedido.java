package com.cardinalidade.cardinalidadeJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ItemPedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private Integer quantidade;
    private BigDecimal precoUnitario;

    @ManyToOne
    @JoinColumn(name="pedido_id", referencedColumnName = "codigo")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name="produto_id", referencedColumnName = "codigo")
    private Produto produto;
}
