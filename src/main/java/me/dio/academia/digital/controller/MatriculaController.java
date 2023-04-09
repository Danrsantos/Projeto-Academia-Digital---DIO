package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaServiceImpl service;

    //Buscando todas as matriculas
    @GetMapping
    public List<Matricula> getall(){
        return service.getAll();
    }

    //Criando uma matricula
    @PostMapping
    public Matricula create(@RequestBody MatriculaForm matriculaForm){
        return service.create(matriculaForm);
    }

    //Buscando matricula pela id
    @GetMapping("/{id}")
    public Matricula get(@PathVariable Long id){
        return service.get(id);
    }

    //Deletar matricula
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
