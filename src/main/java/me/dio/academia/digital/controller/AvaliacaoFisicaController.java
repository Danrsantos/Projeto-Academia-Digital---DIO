package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.digital.service.IAvaliacaoFisicaService;
import me.dio.academia.digital.service.impl.IAvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
    @Autowired
    private IAvaliacaoFisicaServiceImpl service;

    //Criando avaliação
    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }

    //Buscando todas as avaliações
    @GetMapping
    public List<AvaliacaoFisica> getAll(){
        return service.getAll();
    }

    //Buscando todas avaliações de um aluno
    @GetMapping("/aluno/{id}")
    public AvaliacaoFisica getAllAvaliacoesById(@PathVariable Long id){
        return service.get(id);
    }

    //Update por Id
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public AvaliacaoFisica update(@RequestBody AvaliacaoFisicaUpdateForm avaliacaoFisicaFormUpdate, @PathVariable Long id){
        return service.update(id,avaliacaoFisicaFormUpdate);
    }

    //Deletar atividade fisica
    @DeleteMapping("/delete/{id}")
    public void AvaliacaoFisica(@PathVariable Long id){
        service.delete(id);
    }


}
