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
public class Notebook extends Computador implements Equipamento{
    private String bateria;

    public Notebook() {
    }

    public Notebook(String bateria, String sistemaOperacional, String placaVideo, String hd, String processador, String memoria) {
        super(sistemaOperacional, placaVideo, hd, processador, memoria);
        this.bateria = bateria;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }
}
