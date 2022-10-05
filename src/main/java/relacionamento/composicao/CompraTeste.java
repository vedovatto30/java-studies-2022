package relacionamento.composicao;

public class CompraTeste {

    public static void main(String[] args) {
        Compra c1 = new Compra();

        c1.cliente = "João";
        c1.adicionarItem(new Item("Caneta",20,1.50));
        c1.adicionarItem(new Item("Borracha",10,4.50));

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());

       double total = c1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
        System.out.println("Total é: " + total );
    }
}
