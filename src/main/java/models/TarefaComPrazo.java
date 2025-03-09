/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author fkdia
 */
public class TarefaComPrazo extends Tarefa{

    private LocalDate prazo;
    
    public TarefaComPrazo() {
    }

    public TarefaComPrazo(String descricao, int prioridade, LocalDate prazo, boolean status) {
        super(descricao, prioridade,status);
        this.prazo = prazo;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }
    
    
    
}
