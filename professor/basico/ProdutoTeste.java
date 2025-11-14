package basico;

public class ProdutoTeste {
    static void main() {
        Produto p1 = new Produto();
        p1.id = 7;
        p1.nome = "Notebook";
        p1.preco = 8745.23;
        p1.desconto = 0.25;

        Produto p2 = new Produto();
        p2.id = 435;
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        System.out.printf("\nO %s tem preço final de R$%.2f",
                p1.nome, p1.precoFinal());
        System.out.printf("\nO %s tem preço final de R$%.2f\n",
                p2.nome, p2.precoFinal());

        System.out.println(p1);
    }
}
