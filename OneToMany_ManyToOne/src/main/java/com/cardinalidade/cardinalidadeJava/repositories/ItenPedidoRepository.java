package com.cardinalidade.cardinalidadeJava.repositories;

import com.cardinalidade.cardinalidadeJava.model.ItemPedido;
import com.cardinalidade.cardinalidadeJava.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItenPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
