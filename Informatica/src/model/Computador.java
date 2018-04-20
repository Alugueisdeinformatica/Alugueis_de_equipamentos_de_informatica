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
public class Computador extends Equipamento{
    private String sistemaOperacional;
    private String placaVideo;
    private String capacidadeHD;//desmembrar em classe nova, para ter os atributos. Ex: marca, capacidade modelo...
    private String processador;// idem HD
    private String memoria;

    public Computador() {
        super();
    }

    public Computador(String sistemaOperacional, String placaVideo, String capacidadeHD, String processador, String memoria, int codEquipamento, String modelo, String marca, int quantEstoque, String categoria, double valorDiaria) {
        super(codEquipamento, modelo, marca, quantEstoque, categoria, valorDiaria);
        this.sistemaOperacional = sistemaOperacional;
        this.placaVideo = placaVideo;
        this.capacidadeHD = capacidadeHD;
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

    public String getCapacidadeHD() {
        return capacidadeHD;
    }

    public void setCapacidadeHD(String capacidadeHD) {
        this.capacidadeHD = capacidadeHD;
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
        return "Computador{" + "\nsistemaOperacional=" + sistemaOperacional + 
                "\nQuantidade: " + getQuantEstoque() +
                "\nCategoria: " + getCategoria() +
                ", \nplacaVideo=" + placaVideo + 
                ", \ncapacidadeHD=" + capacidadeHD + 
                ", \nprocessador=" + processador + 
                ", \nmemoria=" + memoria + 
                '}';
    }   
    
    public boolean validaComputador(){
        return !sistemaOperacional.equals("") &&
               !placaVideo.equals("") &&
               !capacidadeHD.equals("") &&
               !processador.equals("") &&
               !memoria.equals("");
    }
}
