/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lonely
 */
public class GerenciaTarefa {
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();
    
    public boolean addTarefa(Tarefa tarefa){
        if(tarefas.contains(tarefa)){
            return false;
        }
        
        return tarefas.add(tarefa);
    }
    
    public boolean removeTarefa(Tarefa tarefa){
        if(!tarefas.contains(tarefa)){
            return false;
        }
        
        return tarefas.remove(tarefa);
    }
    
    public List<Tarefa> getTarefas(){
        if(!tarefas.isEmpty()) return this.tarefas;
        return new ArrayList<Tarefa>();
    }
}
