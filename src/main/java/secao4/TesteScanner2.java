package secao4;

import java.util.Scanner;

public class TesteScanner2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x;
        String s1,s2,s3;

        x= in.nextInt();
        in.nextLine(); //somente para corrigir a linha pendente
        s1 = in.nextLine();
        s2 = in.nextLine();
        s3 = in.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        in.close();
    }
}
