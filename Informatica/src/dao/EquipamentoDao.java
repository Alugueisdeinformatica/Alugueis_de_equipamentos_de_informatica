/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.interfaces.IEquipamento;

/**
 *
 * @author Luís Gustavo
 */
public class EquipamentoDao {
    private List<IEquipamento> lista = null;

    public EquipamentoDao() {
        lista = new ArrayList<IEquipamento>();
    }
    
    public void adicionaEquipamento(IEquipamento equipamento){
        lista.add(equipamento);
    }
    
    public IEquipamento buscaEquipamento(String codEquipamento){
        IEquipamento eq = null;
        for(int i = 0; i < lista.size(); i++){
            if(codEquipamento.equals(lista.get(i).codEquipamento())){
                eq = lista.get(i);
            }
        }
        return eq;
    }
    
    public void removerEquipamento(String codEquipamento){
        IEquipamento eq = buscaEquipamento(codEquipamento);
        if(eq != null){
            lista.remove(eq);
        }
    }
    
    public void atualizarEquipamento(IEquipamento equipamento){
        IEquipamento eq = buscaEquipamento(equipamento.codEquipamento());
        if(eq != null){
            int idx = lista.indexOf(eq);
            lista.set(idx, eq);
        }
    }
    
    public List<IEquipamento> todosEquipamentos(){
        return lista;
    }
}
