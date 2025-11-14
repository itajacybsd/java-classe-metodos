package desafio;

public class Simples {
    int a = 10;

    static int b = 12;
    static void main() {
        Simples conteudo = new Simples(); // precisa instanciar um objeto
        conteudo.a = 100;
        System.out.println(conteudo.a);
        System.out.println(new Simples().a);  // Leo

        System.out.println(b);  // membro de classe

    }
}
