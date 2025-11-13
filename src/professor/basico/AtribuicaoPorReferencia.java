package basico;

public class AtribuicaoPorReferencia {
    static void main() {
        Pessoa p1 = new Pessoa("Maria", 29);
        Pessoa p2 = p1;

        p2.nome = "Rebeca Maria";

        IO.println(p1.nome);
        IO.println(p2.nome);

        p2 = new Pessoa();
        p2.nome = "Pedro";

        IO.println(p1.nome);
        IO.println(p2.nome);

        p1 = p2;

        p1.nome = "Pedro Augusto";

        IO.println(p1.nome);
        IO.println(p2.nome);
    }
}
