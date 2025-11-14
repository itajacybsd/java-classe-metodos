package basico;

@SuppressWarnings("all")
public class Escopo {
    int a = 2;

    void metodoA() {
        System.out.println(a);

        int b = 7;
        System.out.println(b);

        if(b < 10) {
            int c = 12;
            System.out.println(b + c);
            System.out.println(c);
        }

        metodoB(b);
    }

    void metodoB(int b) {
        System.out.println(a);
        System.out.println(b);

        {
            int x = 2;
            System.out.println(x);
        }
    }

    static void main() {
        Escopo escopo = new Escopo();
        escopo.metodoA();
    }
}
