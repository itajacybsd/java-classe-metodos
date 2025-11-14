package basico;

public class CalculadoraTeste {

    static void main() {
        Calculadora calc = new Calculadora();

        double r = calc.somar(3, 7.0);
        IO.println(r);
        IO.println(calc.memoria);

        calc.limparMemoria();

        r = calc.somar(100);
        IO.println(r);
        IO.println(calc.memoria);

        r = calc.memoriaAoQuadrado();
        IO.println(r);
        IO.println(calc.memoria);
    }
}
