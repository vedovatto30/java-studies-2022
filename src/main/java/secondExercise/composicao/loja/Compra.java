package secondExercise.composicao.loja;

import java.util.ArrayList;
import java.util.List;

public class Compra {


    List<Item> itens = new ArrayList<>(); // A compra tem uma lista de item


    void adicionarItem(Produto prod, int qtde){
        this.itens.add(new Item(prod, qtde)); //Criando um item e instanciando produto e quantidade para add ao item
    }

    void adicionarItem(String nome, double preco, int qtde){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtde));
    }

    double obterValorTotal(){ //metodo para verificar o valor total
        double total = 0; //inicia com zero

        for(Item item : itens){ // passando pela lista de itens selecionada
            total += item.quantidade * item.produto.preco; // realizando a multiplicação da quantidade do item pelo
            // preço de cada
        }

        return total; //retorno necessario
    }

}
