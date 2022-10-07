package com.example.ListaTarefas;

import com.example.ListaTarefas.model.Tarefa;
import com.example.ListaTarefas.service.TarefaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {
    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @GetMapping
    public ResponseEntity<List<Tarefa>> getTarefas(){
        List<Tarefa> tarefas = tarefaService.listTarefas();
        return  new ResponseEntity<>(tarefas, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Tarefa> getTarefaById(@PathVariable("id") int id){
        Tarefa tarefa = tarefaService.findTarefaById(id);
        return  new ResponseEntity<>(tarefa, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Tarefa> addTarefa(@RequestBody Tarefa tarefa){
        Tarefa newTarefa = tarefaService.addTarefa(tarefa);
        return new ResponseEntity<>(newTarefa, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Tarefa> updateTarefa(@RequestBody Tarefa tarefa){
        Tarefa tarefas = tarefaService.updateTarefa(tarefa);
        return  new ResponseEntity<>(tarefas, HttpStatus.OK);
    }

    @PutMapping("/updateMany")
    public ResponseEntity<List<Tarefa>> updateTarefa(@RequestBody List<Tarefa> tarefa){
        List<Tarefa> tarefas = tarefaService.updateTarefa(tarefa);
        return  new ResponseEntity<>(tarefas, HttpStatus.OK);
    }
    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTarefa(@PathVariable("id") int id){
        tarefaService.deleteTarefa(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
