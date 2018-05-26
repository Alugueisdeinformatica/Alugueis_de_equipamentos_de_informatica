/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Posto Figueira
 */
public class Item {
    
    private int codItem;
    private Equipamento equipamento;
    private double valorItem;
    private int quantidade;

    public Item() {
        equipamento = new Equipamento();
    }

    public Item(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }    

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }    

    public double getValorItem() {
        return valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }
    
    public void calcularValorItem(){
        valorItem = equipamento.getValorDiaria() * quantidade;
    }   
    
    @Override
    public String toString(){
        String str = "";
        str += "\nCódigo do Item: " + codItem;
        str += "\nValor do Item: " + valorItem;
        str += "\nQuantidade: " + quantidade;
        str += equipamento.toString();
        return str;
    }
}
