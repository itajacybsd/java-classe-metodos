package basico;

public class Calculadora {
    double memoria = 0;

    int somar(int a, int b) {
        int resultado = a + b;
        memoria = resultado;
        return resultado;
    }

    double somar(double x, double y) {
        double resultado = x + y;
        memoria = resultado;
        return resultado;
    }

    double somar(double x) {
        double resultado = x + memoria;
        memoria = resultado;
        return resultado;
    }

    double memoriaAoQuadrado() {
        double resultado = Math.pow(memoria, 2);
        memoria = resultado;
        return resultado;
    }

    void limparMemoria() {
        memoria = 0;
    }
}
