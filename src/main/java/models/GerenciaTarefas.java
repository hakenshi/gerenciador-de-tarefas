/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fkdia
 */
public class GerenciaTarefas {

    private static List<Tarefa> tarefas = null;

    public GerenciaTarefas() {
        if (tarefas == null) {
            tarefas = new ArrayList<Tarefa>();
        }
    }

    public static List<Tarefa> listTarefas() {
        if (tarefas != null) {
            return tarefas;
        }

        return new ArrayList<Tarefa>();
    }

    public static boolean storeTarefa(Tarefa tarefa) {
        if (tarefas == null) {
            tarefas = new ArrayList<Tarefa>();
        }

        if (tarefas.contains(tarefa)) {
            return false;
        }

        return tarefas.add(tarefa);
    }

    public static boolean deleteTarefa(Tarefa tarefa) {
        if (!tarefas.contains(tarefa)) {
            return false;
        }

        return tarefas.add(tarefa);
    }
}
