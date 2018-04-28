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
    private int quantidade;

    public Item() {
        equipamento = new Equipamento();
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
    
    public double subValor(){
        return getQuantidade() * getEquipamento().getValorDiaria();    
    }    
}
