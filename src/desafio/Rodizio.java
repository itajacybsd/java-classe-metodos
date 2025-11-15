package desafio;

import java.util.Scanner;

public class Rodizio {


    Pessoa pessoa = new Pessoa();
    double pesoFinal;
    static double engorda;

    static void main() {
        Rodizio p10 = new Rodizio();
        p10.pessoa.nome = "Ricardo";
        p10.pessoa.peso = 80.0;

        Rodizio p20 = new Rodizio();
        p20.pessoa.nome = "Julia";
        p20.pessoa.peso = 56.5;

        String alimentos = "";

        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 2) {
            System.out.println("-----Menu-----");
            System.out.println(" 1 - Comida");
            System.out.println(" 2 - Sair");
            System.out.println("--------------\n");
            System.out.print("Digite a opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();
            System.out.println("--------------\n");
            if (opcao <= 0 && opcao > 2) {
                System.out.println("Opção inválida!");
            }
            if (opcao == 1) {
                Comida comida = new Comida();
                System.out.print("alimento: ");
                String alimento;
                alimento = teclado.nextLine();
//                teclado.nextLine();
                comida.alimento = alimento;
                System.out.print("\npeso: ");
                double peso;
                peso = teclado.nextDouble();
                teclado.nextLine();
                comida.peso = peso;
                System.out.println("\n--------------\n");

                Rodizio.engorda +=  comida.peso;

                alimentos = alimentos + comida.alimento + "\n";

            }  //if


        } // while
        p10.pesoFinal = p10.pessoa.peso + Rodizio.engorda;
        p20.pesoFinal = p20.pessoa.peso + Rodizio.engorda;

        System.out.printf("%s entrou pesando %.2f e saiu pesando %.2f \n",
                p10.pessoa.nome, p10.pessoa.peso, p10.pesoFinal);
        System.out.printf("%s entrou pesando %.2f e saiu pesando %.2f",
                p20.pessoa.nome, p20.pessoa.peso, p20.pesoFinal);
        System.out.println("\nalimentos consumidos: ");
        System.out.printf("%s %n ",alimentos);
    }

}
