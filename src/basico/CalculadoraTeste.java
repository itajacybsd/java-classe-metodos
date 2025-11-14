package basico;

public class CalculadoraTeste {

    static void main() {
        Calculadora calc = new Calculadora();

        double r = calc.somar(3, 7.0);
        System.out.println(r);
        System.out.println(calc.memoria);

        calc.limparMemoria();

        r = calc.somar(100);
        System.out.println(r);
        System.out.println(calc.memoria);

        r = calc.memoriaAoQuadrado();
        System.out.println(r);
        System.out.println(calc.memoria);
    }
}
