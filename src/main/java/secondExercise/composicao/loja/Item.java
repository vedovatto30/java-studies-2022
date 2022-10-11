package secondExercise.composicao.loja;


public class Item {
   final  Produto produto; //O item tem relação de 1 produto

   final int quantidade;

    Item(Produto produto, int quantidade){ //O item tem relação de 1 produto
        this.produto = produto;
        this.quantidade = quantidade;
    }


}
