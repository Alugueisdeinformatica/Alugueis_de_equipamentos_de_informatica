/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.enuns.EValorAluguel;
import model.enuns.EModelo;
import model.enuns.EMarca;
import model.interfaces.IEquipamento;

/**
 *
 * @author Luís Gustavo
 */
public class Equipamento implements IEquipamento{
    private EModelo modelo;
    private EMarca marca;
    private EValorAluguel valor;
    private String codEquipamento;
    private String quantidade;

    public Equipamento() {
    }

    public Equipamento(EModelo modelo, EMarca marca, EValorAluguel valor, String codEquipamento, String quantidade) {
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
        this.codEquipamento = codEquipamento;
        this.quantidade = quantidade;
    }

    public EModelo getModelo() {
        return modelo;
    }

    public void setModelo(EModelo modelo) {
        this.modelo = modelo;
    }

    public EMarca getMarca() {
        return marca;
    }

    public void setMarca(EMarca marca) {
        this.marca = marca;
    }

    public EValorAluguel getValor() {
        return valor;
    }

    public void setValor(EValorAluguel valor) {
        this.valor = valor;
    }

    public void setCodEquipamento(String codEquipamento) {
        this.codEquipamento = codEquipamento;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String codEquipamento() {
        return "";
    }

    @Override
    public int quantidade() {
        return 0;
    }
}
