package basico;

public class Pessoa {
    String nome;
    int idade;

    // construtor 1
    Pessoa() {
        this("Anônimo", 18); // usando this para chamar um construtor
        // sim aqui um construtor está chamando o outro
        // aqui o construtor1, está chamando o construtor2
    }

    // construtor 2
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
