package basico;

public class Data {
    int dia;
    int mes;
    int ano;

    String formatar() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }

    @Override
    public String toString() {
        return this.formatar();
    }
}
