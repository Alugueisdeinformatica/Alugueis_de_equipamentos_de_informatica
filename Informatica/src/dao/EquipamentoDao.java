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
    
    public Equipamento buscaEquipamento(int codEquipamento){
        Equipamento eq = null;
        for(int i = 0; i < lista.size(); i++){
            if(codEquipamento == lista.get(i).getCodEquipamento()){
                eq = lista.get(i);
            }
        }
        return eq;
    }
    
    public void removerEquipamento(int codEquipamento){
        Equipamento eq = buscaEquipamento(codEquipamento);
        if(eq != null){
            lista.remove(eq);
        }
    }
    
    public void atualizarEquipamento(Equipamento equipamento){
        int codigo = equipamento.getCodEquipamento();
        Equipamento eq = buscaEquipamento( codigo );
        if(eq != null){
            int idx = lista.indexOf(eq);
            lista.set(idx, eq);
        }
    }
    
    public List<Equipamento> todosEquipamentos(){
        return lista;
    }
}
