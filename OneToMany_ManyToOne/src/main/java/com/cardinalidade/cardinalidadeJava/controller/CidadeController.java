package com.cardinalidade.cardinalidadeJava.controller;

import com.cardinalidade.cardinalidadeJava.model.CidadeModel;
import com.cardinalidade.cardinalidadeJava.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @PostMapping(path="/cidades")
    @ResponseStatus(HttpStatus.CREATED)
    public CidadeModel cadastrar(@RequestBody CidadeModel cidadeModel){
        return cidadeService.cadastar (cidadeModel);
    }

    @GetMapping(path = "/cidades")
    public List<CidadeModel> buscarTodas(){
        return cidadeService.buscarTodas();
    }

    @GetMapping(path = "/cidades/{codigo}")
    public Optional<CidadeModel> buscarId(@PathVariable Long codigo){
        return cidadeService.buscarId(codigo);
    }

    @PutMapping(path = "/cidades/{codigo}")
    public CidadeModel alterar (@RequestBody CidadeModel cidadeModel){
        return cidadeService.alterar(cidadeModel);
    }

    @DeleteMapping(path = "/cidades/{codigo}")
    public void deletar(@PathVariable Long codigo){
        cidadeService.deletar(codigo);
    }

}
