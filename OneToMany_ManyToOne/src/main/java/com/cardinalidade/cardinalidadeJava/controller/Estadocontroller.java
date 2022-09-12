package com.cardinalidade.cardinalidadeJava.controller;

import com.cardinalidade.cardinalidadeJava.model.CidadeModel;
import com.cardinalidade.cardinalidadeJava.model.EstadoModel;
import com.cardinalidade.cardinalidadeJava.service.CidadeService;
import com.cardinalidade.cardinalidadeJava.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class Estadocontroller {


    @Autowired
    private EstadoService estadoService;

    @PostMapping(path="/estado")
    @ResponseStatus(HttpStatus.CREATED)
    public EstadoModel cadastrar(@RequestBody EstadoModel estadoModel){
        return estadoService.cadastrar (estadoModel);
    }

    @GetMapping(path = "/estado")
    public List<EstadoModel> buscarTodos(){
        return estadoService.buscarTodos();
    }

    @GetMapping(path = "/esstado/{codigo}")
    public Optional<EstadoModel> buscarId(@PathVariable Long codigo){
        return estadoService.buscarId(codigo);
    }

    @PutMapping(path = "/estado/{codigo}")
    public EstadoModel alterar (@RequestBody EstadoModel estadoModel){
        return estadoService.alterar(estadoModel);
    }

    @DeleteMapping(path = "/estado/{codigo}")
    public void deletar(@PathVariable Long codigo){
        estadoService.deletar(codigo);
    }

}
