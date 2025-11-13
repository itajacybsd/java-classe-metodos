package basico;

public class DataV2Teste {
    static void main() {
        DataV2 d1 = new DataV2(2, 12, 2029);
        IO.println(d1);

        DataV2 d2 = new DataV2();
        d2.dia = 7;
        d2.mes = 11;
        d2.ano = 2033;
        IO.println(d2);

        DataV2 d3 = new DataV2(10);
        IO.println(d3);
    }
}
