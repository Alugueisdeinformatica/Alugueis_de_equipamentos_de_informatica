package model;

import java.text.DecimalFormat;

public class Equipamento {
    private int codEquipamento;
    private String modelo;
    private String marca;
    private int quantEstoque;
    private String categoria;
    private float valorDiaria;

    public Equipamento() {
    }

    public Equipamento(int codEquipamento, String modelo, String marca, int quantEstoque, String categoria, float valorDiaria) {
        this.codEquipamento = codEquipamento;
        this.modelo = modelo;
        this.marca = marca;
        this.quantEstoque = quantEstoque;
        this.categoria = categoria;
        this.valorDiaria = valorDiaria;
    }

    public int getCodEquipamento() {
        return codEquipamento;
    }

    public void setCodEquipamento(int codEquipamento) {
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

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }   
    
    public int quantDisponivel(int quant) {
        int total = getQuantEstoque();       
        total += quantEstoque;        
        return total;        
    }
    
    public boolean validaEquipamento(){
        return codEquipamento > 0 &&
               !modelo.equals("") &&
               !marca.equals("") &&
               quantEstoque > 0 &&
               !categoria.equals("") &&
               valorDiaria > 0;
    }
    
    public String toString_(){
        String str = "Código do Equipamento: " + codEquipamento;
        str += "\nModelo: " + modelo;
        str += "\nMarca: " + marca;
        str += "\nCategoria: " + categoria;
        DecimalFormat df = new DecimalFormat("0.00");
        str += "\nValor do Equipamento: R$ " + df.format(valorDiaria);
        return str;
    }
}
