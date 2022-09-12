package com.cardinalidade.cardinalidadeJava.repositories;

import com.cardinalidade.cardinalidadeJava.model.Cliente;
import com.cardinalidade.cardinalidadeJava.model.Endereco;
import com.cardinalidade.cardinalidadeJava.model.ItemPedido;
import com.cardinalidade.cardinalidadeJava.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    @Query(value = "SELECT * FROM pedidos ORDER BY codigo DESC", nativeQuery = true)
    List<Pedido> mostrarUltimosPedidos();

    @Query(value = "SELECT * FROM pedidos order by data_pedido desc", nativeQuery = true)
    List<Pedido> dataPedido();


}
