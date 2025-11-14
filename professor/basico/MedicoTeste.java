package basico;

public class MedicoTeste {
    static void main() {

        MedicoX platonista1 = new MedicoX();
        platonista1.id = 1834;
        platonista1.nome = "Nicholas";
        platonista1.crm = "12345";
        platonista1.salario = 60_000;

        System.out.println(platonista1.nome);

        MedicoX platonista2 = new MedicoX();
        platonista2.id = 2356;
        platonista2.nome = "Jessica";
        platonista2.crm = "23887";
        platonista2.salario = 50_000;

        System.out.printf("O(A) médico(a) plantonista %s tem CRM %s.",
                platonista2.nome, platonista2.crm);
    }
}
