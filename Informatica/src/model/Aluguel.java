/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
/**
 *
 * @author Luís Gustavo
 */
public class Aluguel {
    public static int numero = 0;
    private Cliente cliente;
    private List<Item> lista;
    private Date dataAluguel;
    private double valorTotal;
    private int dias;

    public Aluguel() {
        numero++;
        lista = new ArrayList<Item>();
        dataAluguel = new Date();
    }    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(Date dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getNumero() {
        return numero;
    }
    
    public void adicionaItem(Item item){
        lista.add(item);
    }
    
    public Item buscarItem(int codigo)
    {
        Item it = null;
        for(Item item : lista)
        {
            if(item.getEquipamento().getCodEquipamento() == codigo)
                it = item;
        }
        
        return it;
    }
    
    public void removerItem(int codigo)
    {
        Item item = buscarItem(codigo);
        if(item != null)
        {
            lista.remove(item);
        }
    }
    
    public List<Item> todosItens(){
        return lista;
    }
    
    public void calcularValorTotal(){
        float soma = 0;
        for(Item item : lista){
            soma += item.getValorItem();
        }
        soma = soma * dias;
        valorTotal = soma;
    }
    
    public Date dataDevolucao() {
	Calendar cal = new GregorianCalendar();
	cal.setTime(dataAluguel);
	cal.add(Calendar.DAY_OF_MONTH, Integer.parseInt(Integer.toString(dias)));
	return cal.getTime();
    }
}
