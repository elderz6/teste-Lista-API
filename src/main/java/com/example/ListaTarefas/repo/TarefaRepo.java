package com.example.ListaTarefas.repo;

import com.example.ListaTarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepo extends JpaRepository<Tarefa, Integer> {

    void deleteTarefaById(int id);

    Tarefa findTarefaById(int id);
}
