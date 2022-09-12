package com.cardinalidade.cardinalidadeJava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produtos")
public class Produto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private LocalDate dataCadastro = LocalDate.now();
	
//	@ManyToOne
//	@JoinColumn(name = "categoria_id")
//	private Categoria categoria;

	@JsonIgnore
	@OneToMany(mappedBy = "produto", cascade=CascadeType.ALL)
	private List<ItemPedido> pedidos = new ArrayList<>();

}
