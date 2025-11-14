package basico;

public class MegaSenaTeste {
    static void main() {
        MegaSena aposta1 = new MegaSena();
        IO.println(aposta1);

        MegaSena aposta2 = new MegaSena(3, 9, 23, 32, 47, 59);
        IO.println(aposta2);
    }
}
