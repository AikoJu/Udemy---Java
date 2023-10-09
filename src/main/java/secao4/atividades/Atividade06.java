package secao4.atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Double A,B,C, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("Digite 3 valores:");
        A = in.nextDouble();
        B = in.nextDouble();
        C = in.nextDouble();

        triangulo = A*C/2;
        circulo = Math.PI*(C*C);
        trapezio = (A + B)*C/2;
        quadrado = B * B;
        retangulo = A * B;

        System.out.println("""
                TRIANGULO: %.3f
                CIRCULO: %.3f
                TRAPEZIO: %.3f
                QUADRADO: %.3f
                RETANGULO: %.3f
                """.formatted(triangulo,circulo,trapezio,quadrado,retangulo));

        in.close();
    }
}
