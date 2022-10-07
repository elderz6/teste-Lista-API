package com.example.ListaTarefas.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int id;
    private String nomeTarefa;
    private float custoTarefa;
    private String dataTarefa;
    private int ordemTarefa;

    public Tarefa(){}

    public Tarefa(String nome, float custo, String data, int ordem) {
        nomeTarefa = nome;
        custoTarefa = custo;
        dataTarefa = data;
        ordemTarefa = ordem;
    }

    public int getId() {
        return id;
    }

    public void setId(int key) {
        id = key;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public float getCustoTarefa() {
        return custoTarefa;
    }

    public void setCustoTarefa(float custoTarefa) {
        this.custoTarefa = custoTarefa;
    }

    public int getOrdemTarefa() {
        return ordemTarefa;
    }

    public void setOrdemTarefa(int ordemTarefa) {
        this.ordemTarefa = ordemTarefa;
    }

    public String getDataTarefa() {
        return dataTarefa;
    }

    public void setDataTarefa(String dataTarefa) {
        this.dataTarefa = dataTarefa;
    }
}
