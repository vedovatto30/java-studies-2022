package secondExercise.composicao;

public class Item {


    Compra compra;
    String nome;
    int quantidade;
    double preco;


    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
