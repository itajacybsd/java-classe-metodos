package basico;

public class DataTeste {
    static void main() {
        Data d1 = new Data();
        System.out.println(d1);

        d1.dia = 7;
        d1.mes = 3;
        d1.ano = 2029;

        String data = d1.formatar();
        System.out.println(data);
        System.out.println(d1.formatar());
        System.out.println(d1.toString());
        System.out.println(d1);
    }
}
