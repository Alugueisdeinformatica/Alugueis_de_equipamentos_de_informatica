package model;

public class Item {
    
    private int codItem;
    private Equipamento equipamento;
    private float valorItem;
    private int quantidade;

    public Item() {
        equipamento = new Equipamento();
    }

    public Item(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }    

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }    

    public float getValorItem() {
        return valorItem;
    }

    public void setValorItem(float valorItem) {
        this.valorItem = valorItem;
    }
    
    public void calcularValorItem(){
        valorItem = equipamento.getValorDiaria() * quantidade;
    }   
    
    @Override
    public String toString(){
        String str = equipamento.toString();
        return str;
    }
}
