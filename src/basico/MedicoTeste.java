package basico;

public class MedicoTeste {
    static void main() {
        Medico plantonista1 = new Medico();
        plantonista1.id =1834;
        plantonista1.nome = "Nicholas";
        plantonista1.crm = "12345";
        plantonista1.salario = 60_000;

        System.out.println(plantonista1.nome);


        Medico plantonista2 = new Medico();
        plantonista2.id =834;
        plantonista2.nome = "Jessica";
        plantonista2.crm = "123";
        plantonista2.salario = 50_000;

        System.out.printf("O medico plantonista %s tem CRM %s", plantonista2.nome, plantonista2.crm);

    }
}
