package basico;

public class DataTeste {
    static void main() {
        Data d1 = new Data();
        IO.println(d1);

        d1.dia = 7;
        d1.mes = 3;
        d1.ano = 2029;

        String data = d1.formatar();
        IO.println(data);
        IO.println(d1.formatar());
        IO.println(d1);
    }
}
