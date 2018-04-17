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
public class Impressora extends Equipamento{
    private String tipo;
    private String tecnologia;
    private String especificacao;

    public Impressora() {
        super();
    }

    public Impressora(String tipo, String tecnologia, String especificacao) {
        this();
        this.tipo = tipo;
        this.tecnologia = tecnologia;
        this.especificacao = especificacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }
    
    @Override
    public String toString() {
        return "\n\nImpressora{" + "\ntipo=" + tipo + 
               "\n, tecnologia=" + tecnologia + 
               ",\n especificacao=" + especificacao + '}';
    }   
}
