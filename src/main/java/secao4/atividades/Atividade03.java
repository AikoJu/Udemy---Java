package secao4.atividades;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A,B,C,D, diferenca;

        System.out.println("Digite 4 valores:");
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        D = in.nextInt();

        diferenca = A * B - C * D;

        System.out.println("Diferença= " + diferenca);

        in.close();
    }
}
