package com.cardinalidade.cardinalidadeJava.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cidades")
@Entity
public class CidadeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "cidade")
    private String cidade;

    @ManyToOne
    @JoinColumn(name = "estados_id", referencedColumnName = "codigo")
    private EstadoModel estadoModel;

}
