package basico;

public class Pessoa {
    String nome;
    int idade;

    Pessoa() {
        this("Anônimo", 18);
    }

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
