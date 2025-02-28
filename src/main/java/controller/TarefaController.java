/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.GerenciaTarefa;
import model.TarefaSimples;

/**
 *
 * @author lonely
 */
public class TarefaController{
    
    public boolean storeTarefaSimples(String descricao, int prioridade){         
       return GerenciaTarefa.addTarefa(new TarefaSimples(descricao, prioridade));
    }
}
