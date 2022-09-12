package com.cardinalidade.cardinalidadeJava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "estado")
@Entity
public class EstadoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 22, nullable = false)
    private String nome;

    @Column(length = 2, nullable = false)
    private String sigla;

    @JsonIgnore
    @OneToMany(mappedBy = "estadoModel", cascade = CascadeType.ALL)
    private List<CidadeModel> cidades = new ArrayList<>();
}
