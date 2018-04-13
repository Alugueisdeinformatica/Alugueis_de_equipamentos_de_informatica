/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Equipamento;

/**
 *
 * @author Luís Gustavo
 */
public class EquipamentoDao {
    private List<Equipamento> lista = null;

    public EquipamentoDao() {
        lista = new ArrayList<Equipamento>();
    }
    
    public void adicionaEquipamento(Equipamento equipamento){
        lista.add(equipamento);
    }
    
    public Equipamento buscaEquipamento(String numSerie){
        Equipamento eq = null;
        for(int i = 0; i < lista.size(); i++){
            if(numSerie.equals(lista.get(i).getNumSerie())){
                eq = lista.get(i);
            }
        }
        return eq;
    }
    
    public void removerEquipamento(String numSerie){
        Equipamento eq = buscaEquipamento(numSerie);
        if(eq != null){
            lista.remove(eq);
        }
    }
    
    public void atualizarEquipamento(Equipamento equipamento){
        Equipamento eq = buscaEquipamento(equipamento.getNumSerie());
        if(eq != null){
            int idx = lista.indexOf(eq);
            lista.set(idx, eq);
        }
    }
    
    public List<Equipamento> todosEquipamentos(){
        return lista;
    }
}
