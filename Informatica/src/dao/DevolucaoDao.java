package dao;

import java.util.ArrayList;
import java.util.List;
import model.Aluguel;

public class DevolucaoDao {
    private List<Aluguel> lista = null;
    
    public DevolucaoDao() {
        lista = new ArrayList<Aluguel>();
    }
    
    public void adicionaAluguel(Aluguel aluguel){
        lista.add(aluguel);
    }
    
    public Aluguel buscaAluguel(int id){
        Aluguel al = null;
        for(int i = 0; i < lista.size(); i++){
            if(id == lista.get(i).getNumero()){
                al = lista.get(i);
            }
        }
        return al;
    }
    
    public List<Aluguel> buscaAluguel(String cpf){
        List<Aluguel> al = new ArrayList<Aluguel>();
        for(int i = 0; i < lista.size(); i++){
            if(cpf.equals(lista.get(i).getCliente().getCpf())){
                al.add(lista.get(i));
            }
        }
        return al;
    }
    
    public List<Aluguel> todosAlugueis(){
        return lista;
    }
    
}
