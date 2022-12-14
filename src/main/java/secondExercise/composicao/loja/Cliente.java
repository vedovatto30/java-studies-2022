package secondExercise.composicao.loja;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

   final String name;

   final List<Compra> compras = new ArrayList<>(); // O cliente tem uma lista de compras

    public Cliente(String name) {
        this.name = name;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }

    double obterValorTotal(){
       double total = 0;

       for( Compra comp : compras){
           total += comp.obterValorTotal();
       }

        return total;
    }



}
