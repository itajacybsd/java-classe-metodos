package basico;

@SuppressWarnings("all")
public class Escopo {
    int a = 2;

    void metodoA() {
        IO.println(a);

        int b = 7;
        IO.println(b);

        if(b < 10) {
            int c = 12;
            IO.println(b + c);
            IO.println(c);
        }

        metodoB(b);
    }

    void metodoB(int b) {
        IO.println(a);
        IO.println(b);

        {
            int x = 2;
            IO.println(x);
        }
    }

    static void main() {
        Escopo escopo = new Escopo();
        escopo.metodoA();
    }
}
