package relacionamento.composicao.loja;

public class Sistema {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("João");

        Compra compra1 = new Compra();
        compra1.adicionarItem("TV", 2.700, 100); // Ao chamar a compra1 e inserir o metodo
        //adicionarItem é necessário informar o nome, preco e quantidade

        //seguindo o metodo abaixo

        //void adicionarItem(String nome, double preco, int qtde){
        //        var produto = new Produto(nome, preco);
        //        this.itens.add(new Item(produto, qtde)); o produto informado que ja possui nome e preco
                                                        // recebe mais a quantidade
        //    }
        compra1.adicionarItem(new Produto("Geladeira", 4.387), 50);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Laptop", 3.700, 75);
        compra2.adicionarItem(new Produto("Iphone XX", 6.750), 125);

        Cliente c2 = new Cliente("Maria");
        c1.adicionarCompra(compra1); // posso adicionar a compra utilizado o metodo criado em cliente
        c1.compras.add(compra2); // ou fazendo direto nesse formato

        System.out.println(c1.obterValorTotal()); //imprimindo o valor total da compra
    }
}
