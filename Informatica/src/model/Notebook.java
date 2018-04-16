/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.enuns.EMarca;
import model.enuns.EModelo;
import model.enuns.EValorAluguel;

/**
 *
 * @author Luís Gustavo
 */
public class Notebook extends Computador{
    private String bateria;

    public Notebook() {
    }

    public Notebook(String bateria, String sistemaOperacional, String placaVideo, String hd, String processador, String memoria, EModelo modelo, EMarca marca, EValorAluguel valor, String codEquipamento, String quantidade) {
        super(sistemaOperacional, placaVideo, hd, processador, memoria, modelo, marca, valor, codEquipamento, quantidade);
        this.bateria = bateria;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }
}
