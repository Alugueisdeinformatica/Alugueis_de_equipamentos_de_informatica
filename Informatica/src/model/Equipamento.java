/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luís Gustavo
 */
public class Equipamento {
    private String codEquipamento;
    private String modelo;
    private String marca;
    private String quantidade;
    private String valorUnitarioAluguel;

    public Equipamento() {
    }

    public Equipamento(String codEquipamento, String modelo, String marca, String quantidade, String valorUnitarioAluguel) {
        this.codEquipamento = codEquipamento;
        this.modelo = modelo;
        this.marca = marca;
        this.quantidade = quantidade;
        this.valorUnitarioAluguel = valorUnitarioAluguel;
    }

    public String getCodEquipamento() {
        return codEquipamento;
    }

    public void setCodEquipamento(String codEquipamento) {
        this.codEquipamento = codEquipamento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValorUnitarioAluguel() {
        return valorUnitarioAluguel;
    }

    public void setValorUnitarioAluguel(String valorUnitarioAluguel) {
        this.valorUnitarioAluguel = valorUnitarioAluguel;
    }
}