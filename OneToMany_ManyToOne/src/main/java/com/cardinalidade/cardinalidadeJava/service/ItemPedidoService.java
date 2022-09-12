package com.cardinalidade.cardinalidadeJava.service;

import com.cardinalidade.cardinalidadeJava.model.ItemPedido;
import com.cardinalidade.cardinalidadeJava.model.Pedido;
import com.cardinalidade.cardinalidadeJava.repositories.ItenPedidoRepository;
import com.cardinalidade.cardinalidadeJava.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemPedidoService {

    @Autowired
    private ItenPedidoRepository itenPedidoRepository;

    public List<ItemPedido> buscarTodos(){
        return itenPedidoRepository.findAll();
    }

    public Optional<ItemPedido> buscarId(Integer codigo){
        return itenPedidoRepository.findById(codigo);
    }

    public ItemPedido cadastrar(ItemPedido itemPedido){
        itemPedido.getCodigo();
        itemPedido.getPrecoUnitario();
        itemPedido.getQuantidade();
        return itenPedidoRepository.save(itemPedido);
    }

    public ItemPedido alterar(ItemPedido itemPedido){
        itemPedido.getCodigo();
        itemPedido.getPrecoUnitario();
        itemPedido.getQuantidade();
        return itenPedidoRepository.save(itemPedido);
    }

    public void deletar(Integer codigo){
        itenPedidoRepository.deleteById(codigo);
    }

}
