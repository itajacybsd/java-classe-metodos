package basico;

import java.util.Date;

public class Inicializacao {

    int a;
    double b;
    boolean c;
    char d;
    Date e;
    String s;

    void metodoA() {
        IO.println(a);
        IO.println(b);
        IO.println(c);
        IO.println(d + 0);
        IO.println(e);
        IO.println(s);


        int f = 0;
        IO.println(f);
    }

    static void main() {
        Inicializacao init = new Inicializacao();
        init.metodoA();
    }
}
