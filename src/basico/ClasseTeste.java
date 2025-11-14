package basico;

public class ClasseTeste {
    static void main() {
        Classe c1 = new Classe();
        c1.nome = "Ana";
        Classe.status = 7;
        System.out.println(c1.nome);
        c1.teste();

        Classe c2 = new Classe();
        c2.nome = "Pedro";
        Classe.status = 1;
        System.out.println(c2.nome);
        c2.teste();

        System.out.println(Classe.status);
        Classe.xyz();
    }
}
