package model;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Aluguel {
    public int numero;
    private Cliente cliente;
    private List<Item> lista;
    private Date dataAluguel;
    private double valorTotal;
    private int dias;
    
    SimpleDateFormat fm; //Formatador
    SimpleDateFormat fmh;  //Formatador
    DecimalFormat df;  //Formatador

    public Aluguel() {
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

    public void setNumero(int numero) {
        this.numero = numero;
    }    
    
    public void adicionaItem(Item item){
        lista.add(item);
    }
    
    public Item buscarItem(int codigo){
        Item it = null;
        for(Item item : lista){
            if(item.getCodItem() == codigo)
                it = item;
        }        
        return it;
    }
    
    public void removerItem(int codigo){
        Item item = buscarItem(codigo);
        if(item != null){
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
    
    @Override
    public String toString(){
        fm = new SimpleDateFormat("dd/MM/yyyy");
        fmh = new SimpleDateFormat("HH:mm:ss");
        df = new DecimalFormat("0.00");
        
        String str = "";
        str += "\nNúmero do Aluguel: " + numero;
        str += "\nData do Aluguel " + fm.format(dataAluguel);
        str += "\nHorário do Aluguel: " + fmh.format(dataAluguel);
        str += "\nData da Devolução: " + fm.format(dataDevolucao());
        str += "\nValor Total: R$ " + df.format(valorTotal);
        str += "\n\n*******Informações do Cliente*******\n";
        str += cliente.toString();
        str += "\n\n****Informações dos Equipamentos****\n";
        for(Item i : lista){
            str += "Quantidade alugada: " + i.getQuantidade() + "\n";
            str += i.getEquipamento().toString_() + "\n" + i.getEquipamento().toString();
            str += "\n------------------------------------\n";
        }
        return str;
    }
    
    public String infoAluguel(){
        fm = new SimpleDateFormat("dd/MM/yyyy");
        fmh = new SimpleDateFormat("HH:mm:ss");
        df = new DecimalFormat("0.00");
        
        String str = "Data do Aluguel: " + fm.format(dataAluguel);
        str += "\nData de Devolução: " + fm.format(dataDevolucao());
        str += "\nHorário do Aluguel: " + fmh.format(dataAluguel);
        str += "\nValor Total: R$ " + df.format(valorTotal);
        return str;
    }
}
