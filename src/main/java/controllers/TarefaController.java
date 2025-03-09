/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.time.LocalDate;
import java.util.List;
import models.GerenciaTarefas;
import models.TarefaComPrazo;
import models.Tarefa;
import models.TarefaSimples;

/**
 *
 * @author fkdia
 */
public class TarefaController {

    public List<Tarefa> getTarefas() {
        return GerenciaTarefas.listTarefas();
    }

    public boolean storeTarefa(String descricao, int prioridade, LocalDate prazo, boolean status) {
        if (prazo != null) {
            return GerenciaTarefas.storeTarefa(new TarefaComPrazo(descricao, prioridade, prazo, status));
        }
        return GerenciaTarefas.storeTarefa(new TarefaSimples(descricao, prioridade, status));
    }

    public boolean deletarTarefa(String descricao, int prioridade, LocalDate prazo, boolean status) {

        var listaTarefas = GerenciaTarefas.listTarefas();

        if (prazo != null) {
            var tarefaComPrazo = new TarefaComPrazo(descricao, prioridade, prazo, status);

            if (listaTarefas.contains(tarefaComPrazo)) {
                return GerenciaTarefas.deleteTarefa(tarefaComPrazo);
            }
        } else {
            var tarefaSimples = new TarefaSimples(descricao, prioridade, status);

            if (listaTarefas.contains(tarefaSimples)) {
                return GerenciaTarefas.deleteTarefa(tarefaSimples);
            }

        }
        return false;
    }

}
