package dao;

import java.util.ArrayList;
import java.util.List;
import model.Aluguel;

public class AluguelDao {
    private List<Aluguel> lista = null;

    public AluguelDao() {
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
    
    public void removerAluguel(int id){
        Aluguel al = buscaAluguel(id);
        if(al != null){
            lista.remove(al);
        }
    }
    
    public void alteraAluguel(Aluguel aluguel){
        Aluguel al = buscaAluguel(aluguel.getNumero());
        if(al != null){
            int idx = lista.indexOf(al);
            lista.set(idx, aluguel);
        }
    }
    
    public List<Aluguel> todosAlugueis(){
        return lista;
    }
}
