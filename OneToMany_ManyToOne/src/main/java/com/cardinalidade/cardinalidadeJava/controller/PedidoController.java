package com.cardinalidade.cardinalidadeJava.controller;

import com.cardinalidade.cardinalidadeJava.model.ItemPedido;
import com.cardinalidade.cardinalidadeJava.model.Pedido;
import com.cardinalidade.cardinalidadeJava.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping(path = "/pedidos")
    public Iterable<Pedido> buscarTodosPedidos(){
        return pedidoService.buscarTodos();
    }

    @GetMapping(path = "/pedidos/{codigo}")
    public Optional<Pedido> buscarPorId(@PathVariable Integer codigo){
        return pedidoService.buscarId(codigo);
    }

    @PostMapping(path = "/pedidos")
    @ResponseStatus(HttpStatus.CREATED)
    public Pedido cadastrar(@RequestBody Pedido pedido){
        return pedidoService.cadastrar(pedido);
    }

    @PutMapping(path = "/pedidos/{codigo}")
    public Pedido alterarCliente(@RequestBody Pedido pedido){
        return pedidoService.alterar(pedido);
    }

    @DeleteMapping(path = "/pedidos/{codigo}")
    public void deletarCliente(@PathVariable Integer codigo){
        pedidoService.deletar(codigo);
    }

    @GetMapping(path = "mostrarUltimosPedidos")
    public List<Pedido> getmostrarUltimosPedidos(){
        return pedidoService.getmostrarUltimosPedidoss();
    }

    @GetMapping(path = "dataPedido")
    public List<Pedido> dataPedido(){
        return pedidoService.dataPedido();
    }



}
