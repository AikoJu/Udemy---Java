package secao7;

import java.util.Scanner;

public class Funções {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite 3 números:");
        Integer n1 = in.nextInt();
        Integer n2 = in.nextInt();
        Integer n3 = in.nextInt();
        Integer maior = max(n1,n2,n3);

        exibirResultado(maior);
    }

    public static Integer max(Integer n1, Integer n2, Integer n3){
        Integer maior;
        if(n1 > n2 && n1 > n3){
            maior = n1;
        } else if (n2 > n3) {
            maior = n2;
        }else{
            maior = n3;
        }
        return maior;
    }

    public static void exibirResultado(Integer maior){
        System.out.println("O maior Número é: " + maior);
    }
}
