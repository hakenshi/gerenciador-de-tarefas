/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author lonely
 */
public class TarefaComPrazo extends Tarefa{
    private LocalDate prazo;

    public TarefaComPrazo() {}

    public TarefaComPrazo(LocalDate prazo, String descricao, int prioridade) {
        super(descricao, prioridade);
        this.prazo = prazo;
    }
    
    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    @Override
    public String toString() {
        return super.toString() + "prazo: \n" + this.getPrazo();
    }
      
}
