package basico;

public class Produto {
    int id;
    String nome;
    double preco;
    double desconto;

    double precoFinal() {
        return this.preco * (1 - this.desconto);
    }

    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", desconto=" + desconto +
                '}';
    }
}
