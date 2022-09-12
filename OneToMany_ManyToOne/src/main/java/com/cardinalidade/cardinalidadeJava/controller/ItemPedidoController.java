package com.cardinalidade.cardinalidadeJava.controller;

import com.cardinalidade.cardinalidadeJava.model.ItemPedido;
import com.cardinalidade.cardinalidadeJava.model.Pedido;
import com.cardinalidade.cardinalidadeJava.service.ItemPedidoService;
import com.cardinalidade.cardinalidadeJava.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService itemPedidoService;

    @GetMapping(path = "/itempedidos")
    public Iterable<ItemPedido> buscarTodosPedidos(){
        return itemPedidoService.buscarTodos();
    }

    @GetMapping(path = "/itempedidos/{codigo}")
    public Optional<ItemPedido> buscarPorId(@PathVariable Integer codigo){
        return itemPedidoService.buscarId(codigo);
    }

    @PostMapping(path = "/itempedidos")
    @ResponseStatus(HttpStatus.CREATED)
    public ItemPedido cadastrar(@RequestBody ItemPedido itemPedido){
        return itemPedidoService.cadastrar(itemPedido);
    }

    @PutMapping(path = "/itempedidos/{codigo}")
    public ItemPedido alterarPedido(@RequestBody ItemPedido itemPedido){
        return itemPedidoService.alterar(itemPedido);
    }

    @DeleteMapping(path = "/itempedidos/{codigo}")
    public void deletarItemPedido(@PathVariable Integer codigo){
        itemPedidoService.deletar(codigo);
    }

}
