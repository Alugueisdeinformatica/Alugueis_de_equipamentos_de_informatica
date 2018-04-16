/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
/**
 *
 * @author Luís Gustavo
 */
public class Aluguel {
    private String idAluguel;
    private Cliente cliente;
    private Equipamento equipamento;
    private Date dataAtual;
    private String qtAluguel;
    private String valorTotal;

    public Aluguel() {
    }

    public Aluguel(String idAluguel, Cliente cliente, Equipamento equipamento, Date dataAtual, String qtAluguel, String valorTotal) {
        this.idAluguel = idAluguel;
        this.cliente = cliente;
        this.equipamento = equipamento;
        this.dataAtual = dataAtual;
        this.qtAluguel = qtAluguel;
        this.valorTotal = valorTotal;
    }

    public String getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(String idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }

    public String getQtAluguel() {
        return qtAluguel;
    }

    public void setQtAluguel(String qtAluguel) {
        this.qtAluguel = qtAluguel;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public Date dataDevolucao(int dias){
        Date entrega = dataAtual;        
        //entrega.;        
        return entrega;
    }
}
