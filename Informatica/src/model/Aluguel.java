/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Luís Gustavo
 */
public class Aluguel {
    private String idAluguel;
    private Cliente cliente;
    private List<Equipamento> equipamento = null;
    private DateFormat dataAtual;
    private String qtAluguel;
    private String valorTotal;

    public Aluguel() {
        equipamento = new ArrayList<Equipamento>();
    }

    public Aluguel(String idAluguel, Cliente cliente, DateFormat dataAtual, String qtAluguel, String valorTotal) {
        this.idAluguel = idAluguel;
        this.cliente = cliente;
        this.dataAtual = dataAtual;
        this.qtAluguel = qtAluguel;
        this.valorTotal = valorTotal;
    }

    public String getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(String idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DateFormat getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(DateFormat dataAtual) {
        this.dataAtual = dataAtual;
    }

    public String getQtAluguel() {
        return qtAluguel;
    }

    public void setQtAluguel(String qtAluguel) {
        this.qtAluguel = qtAluguel;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void adicionaEquipamento(Equipamento equipamento){
        this.equipamento.add(equipamento);
    }
    
    public Equipamento buscaEquipamento(int codEquipamento){
        Equipamento eq = null;
        for(int i = 0; i < this.equipamento.size(); i++){
            if(codEquipamento == this.equipamento.get(i).getCodEquipamento()){
                eq = this.equipamento.get(i);
            }
        }
        return eq;
    }
    
    public void removerEquipamento(int codEquipamento){
        Equipamento eq = buscaEquipamento(codEquipamento);
        if(eq != null){
            this.equipamento.remove(eq);
        }
    }
    
    public void atualizarEquipamento(Equipamento equipamento){
        int codigo = equipamento.getCodEquipamento();
        Equipamento eq = buscaEquipamento( codigo );
        if(eq != null){
            int idx = this.equipamento.indexOf(eq);
            this.equipamento.set(idx, eq);
        }
    }
    
    public List<Equipamento> todosEquipamentos(){
        return this.equipamento;
    }
    
    public DateFormat dataDevolucao(int dias){
        DateFormat entrega = dataAtual;        
        //entrega.;        
        return entrega;
    }
}
