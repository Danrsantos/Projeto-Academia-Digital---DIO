package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.service.IAlunoService;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;

    //Buscando todos os alunos
    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    //Criando um aluno
    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        return service.create(form);
    }

    //Buscando todas as avaliações de um aluno
    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
        return service.getAllAvaliacaoFisicaId(id);
    }

    //Buscando aluno por Id
    @GetMapping("/{id}")
   public Aluno get(@PathVariable Long id){
        return service.get(id);
    }

    //update
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Aluno update(@RequestBody AlunoUpdateForm alunoUpdateForm, @PathVariable Long id){
        return service.update(id,alunoUpdateForm);
    }

    //Deletar aluno
    @DeleteMapping("/delete/{id}")
    public void Aluno (@PathVariable Long id){
        service.delete(id);
    }








}
