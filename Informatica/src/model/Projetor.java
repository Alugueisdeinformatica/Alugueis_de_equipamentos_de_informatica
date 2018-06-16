package model;

public class Projetor extends Equipamento{
    private String tipo;
    private String luminosidade;
    private String resolucaoOptica;
    private String lampada;
    private String lente;

    public Projetor() {
        super();
    }

    public Projetor(String tipo, String luminosidade, String resolucaoOptica, String lampada, String lente, int codEquipamento, String modelo, String marca, int quantEstoque, String categoria, float valorDiaria) {
        super(codEquipamento, modelo, marca, quantEstoque, categoria, valorDiaria);
        this.tipo = tipo;
        this.luminosidade = luminosidade;
        this.resolucaoOptica = resolucaoOptica;
        this.lampada = lampada;
        this.lente = lente;
    }   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(String luminosidade) {
        this.luminosidade = luminosidade;
    }

    public String getResolucaoOptica() {
        return resolucaoOptica;
    }

    public void setResolucaoOptica(String resolucaoOptica) {
        this.resolucaoOptica = resolucaoOptica;
    }

    public String getLampada() {
        return lampada;
    }

    public void setLampada(String lampada) {
        this.lampada = lampada;
    }

    public String getLente() {
        return lente;
    }

    public void setLente(String lente) {
        this.lente = lente;
    }
    
    public boolean validaProjetor(){
        return !tipo.equals("") &&
               !luminosidade.equals("") &&
               !resolucaoOptica.equals("") &&
               !lampada.equals("") &&
               !lente.equals("");
    }
    
    @Override
    public String toString(){
        String str = "Tipo: " + tipo;
        str += "\nLuminosidade: " + luminosidade;
        str += "\nResolução Máxima: " + resolucaoOptica;
        str += "\nLâmpada: " + lampada;
        str += "\nLente: " + lente;
        return str;
    }
}
