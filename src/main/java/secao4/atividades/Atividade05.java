package secao4.atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int codigo1, codigo2 , qtdPdt1, qtdPdt2;
        double valorProduto1, valorProduto2 , valorTotal;

    System.out.println("Digite o código do 1° produto sua quantidade e valor unitário");
        codigo1 = in.nextInt();
        qtdPdt1 = in.nextInt();
        valorProduto1 = in.nextDouble();

    System.out.println("Digite o código do 2° produto sua quantidade e valor unitário");
        codigo2 = in.nextInt();
        qtdPdt2 = in.nextInt();
        valorProduto2 = in.nextDouble();

    valorTotal = valorProduto1 * qtdPdt1 + valorProduto2 * qtdPdt2;

        System.out.println(String.format("Valor a pagar: R$%.2f",valorTotal ));

        in.close();
    }
}
