package secao6.atividades;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer in = 0;
        Integer out = 0;

        System.out.println("Digite um número: ");
        Integer limite = sc.nextInt();

        for (int i = 0; i <= limite; i++){
            Integer numAtual = sc.nextInt();
            if(numAtual >= 10 && numAtual <= 20){
                in ++;
            }else {
                out ++;
            }
        }
        System.out.println("""
                            In = %d
                            Out = %d""".formatted(in,out));
    }
}
