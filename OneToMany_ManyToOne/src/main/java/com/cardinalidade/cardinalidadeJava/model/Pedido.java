package com.cardinalidade.cardinalidadeJava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private BigDecimal valorTotal;
    private LocalDate dataPedido = LocalDate.now();

    @ManyToOne
    @JoinColumn(name = "cliente_id",referencedColumnName = "codigo")
    private Cliente cliente;

    @JsonIgnore
    @OneToMany (mappedBy = "pedido", cascade=CascadeType.ALL)
    private List<ItemPedido> itens = new ArrayList<>();

}
