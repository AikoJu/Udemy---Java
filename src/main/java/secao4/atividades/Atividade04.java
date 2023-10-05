package secao4.atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int numeroFuncionario, horasTrabalhadas;
        double salarioFuncionarioHora, salarioFinal;

        System.out.println("Digite o número do fúncionário, horas trabalhadas e valor recebido por hora:");
        numeroFuncionario = in.nextInt();
        horasTrabalhadas = in.nextInt();
        salarioFuncionarioHora = in.nextDouble();

        salarioFinal = horasTrabalhadas * salarioFuncionarioHora;

        System.out.println(String.format("O funcionário %d vai receber R$%.2f", numeroFuncionario, salarioFinal));

        in.close();
    }
}
