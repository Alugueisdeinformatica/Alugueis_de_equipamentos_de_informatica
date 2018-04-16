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
public class Computador extends Equipamento{
    private String sistemaOperacional;
    private String placaVideo;
    private String capacidadeHD;//desmembrar em classe nova, para ter os atributos. Ex: marca, capacidade modelo...
    private String processador;// idem HD
    private String memoria;

    public Computador() {
    }

    public Computador(String sistemaOperacional, String placaVideo, String hd, String processador, String memoria, EModelo modelo, EMarca marca, EValorAluguel valor, String codEquipamento, String quantidade) {
        super(modelo, marca, valor, codEquipamento, quantidade);
        this.sistemaOperacional = sistemaOperacional;
        this.placaVideo = placaVideo;
        this.capacidadeHD = hd;
        this.processador = processador;
        this.memoria = memoria;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public String getHd() {
        return capacidadeHD;
    }

    public void setHd(String hd) {
        this.capacidadeHD = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
    
    @Override
    public String toString() {
        return "\n\nComputador{" + "\nsistemaOp=" + sistemaOperacional + 
               ", \nplacaVideo=" + placaVideo + 
               ", \ncapacidadeHD=" + capacidadeHD + 
               ", \nprocessador=" + processador + 
               ", \nmemoria=" + memoria + '}';
    }
}
