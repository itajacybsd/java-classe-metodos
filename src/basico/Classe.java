package basico;

public class Classe {
    String nome;  // membro de objeto
    static int status = 3; //membro de classe

    void teste() {
        System.out.printf("%s %d\n", nome, status);
    }

    static void xyz() {
        System.out.printf("Status: %d\n", status);
    }
}
