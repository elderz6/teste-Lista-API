package com.example.ListaTarefas.service;

import com.example.ListaTarefas.model.Tarefa;
import com.example.ListaTarefas.repo.TarefaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TarefaService {
    private final TarefaRepo tarefaRepo;

    @Autowired
    public TarefaService(TarefaRepo tarefaRepo) {
        this.tarefaRepo = tarefaRepo;
    }

    public Tarefa addTarefa(Tarefa tarefa){
        return tarefaRepo.save(tarefa);
    }

    public List<Tarefa> listTarefas(){
        return tarefaRepo.findAll();
    }

    public Tarefa findTarefaById(int Id){
        return tarefaRepo.findTarefaById(Id);
    }

    public Tarefa updateTarefa(Tarefa tarefa){
        return tarefaRepo.save(tarefa);
    }

    public void deleteTarefa(int Id){
        tarefaRepo.deleteTarefaById(Id);
    }
}
