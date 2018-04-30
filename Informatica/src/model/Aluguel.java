/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
/**
 *
 * @author Luís Gustavo
 */
public class Aluguel {
    private int idAluguel;
    private Cliente cliente;
    private List<Item> lista = null;
    private Date dataAtual;
    private double valorTotal;
    private String dias;

    public Aluguel() {
        lista = new ArrayList<Item>();
    }

    public Aluguel(int idAluguel, Cliente cliente, Date dataAtual, double valorTotal, String dias) {
        lista = new ArrayList<Item>();
        this.idAluguel = idAluguel;
        this.cliente = cliente;
        this.dataAtual = dataAtual;
        this.valorTotal = valorTotal;
        this.dias = dias;
    }

    

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
    
    public void adicionaItem(Item item){
        lista.add(item);
    }
    
    /*public Equipamento buscaEquipamento(int codEquipamento){
        Equipamento eq = null;
        for(int i = 0; i < this.equipamento.size(); i++){
            if(codEquipamento == this.equipamento.get(i).getCodEquipamento()){
                eq = this.equipamento.get(i);
            }
        }
        return eq;
    }*/
    
    public void removerItem(int cod){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getCodItem() == cod)
                lista.remove(lista.get(i));     
        }        
    }
    
    /*public void atualizarEquipamento(Equipamento equipamento){
        int codigo = equipamento.getCodEquipamento();
        Equipamento eq = buscaEquipamento( codigo );
        if(eq != null){
            int idx = this.equipamento.indexOf(eq);
            this.equipamento.set(idx, eq);
        }
    }*/
    
    public List<Item> todosItens(){
        return lista;
    }
    
    public Date dataDevolucao() {
	Calendar cal = new GregorianCalendar();
	cal.setTime(dataAtual);
	cal.add(Calendar.DAY_OF_MONTH, Integer.parseInt(dias));
	return cal.getTime();
    }
    
    public void total(String dias){
        double val = 0;
        for(int i = 0; i < lista.size(); i++){
            val = val + lista.get(i).subValor();
        }
        valorTotal = val * Double.parseDouble(dias);
    }
}
