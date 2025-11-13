package basico;

public class MatematicaTeste {
    static void main() {
        var raio = 6.5;

        IO.println(Matematica.PI * Matematica.potencia(raio, 2));
        IO.println(Math.PI * Math.pow(raio, 2));
    }
}
