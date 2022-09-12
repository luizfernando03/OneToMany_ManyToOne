package com.cardinalidade.cardinalidadeJava.service;

import com.cardinalidade.cardinalidadeJava.model.Cliente;
import com.cardinalidade.cardinalidadeJava.model.ItemPedido;
import com.cardinalidade.cardinalidadeJava.model.Pedido;
import com.cardinalidade.cardinalidadeJava.repositories.ClienteRepository;
import com.cardinalidade.cardinalidadeJava.repositories.EnderecoRepository;
import com.cardinalidade.cardinalidadeJava.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> buscarTodos(){
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> buscarId(Integer codigo){
        return pedidoRepository.findById(codigo);
    }

    public Pedido cadastrar(Pedido pedido){
        pedido.getCodigo();
        pedido.getValorTotal();
        return pedidoRepository.save(pedido);
    }

    public Pedido alterar(Pedido pedido){
       pedido.getCodigo();
       pedido.getValorTotal();

        return pedidoRepository.save(pedido);
    }

    public void deletar(Integer codigo){
        pedidoRepository.deleteById(codigo);
    }

    public List<Pedido>getmostrarUltimosPedidoss(){
        return pedidoRepository.mostrarUltimosPedidos();
    }

    public List<Pedido>dataPedido(){
        return pedidoRepository.dataPedido();
    }



}
