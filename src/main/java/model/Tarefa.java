/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author lonely
 */
public abstract class Tarefa {
    private String descricao;
    private boolean concluida;
    private int prioridade;
    private LocalDate dataCriacao;

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.concluida = false;
        this.prioridade = prioridade;
        this.dataCriacao = LocalDate.now();
    }

    public Tarefa(){}
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    @Override
    public String toString() {
        return "Tarefa{" + "descricao=" + descricao + ", concluida=" + concluida + ", prioridade=" + prioridade + ", dataCriacao=" + dataCriacao + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(this.equals(obj))) return false;
        
        if(!(obj instanceof Tarefa)) return false;
        
         if(!this.descricao.equals(((Tarefa) obj).descricao)) return false;
        
        return true;
    }
    
   
}
