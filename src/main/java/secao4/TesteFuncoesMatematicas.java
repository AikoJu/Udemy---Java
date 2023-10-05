package secao4;

public class TesteFuncoesMatematicas {
    public static void main(String[] args) {
        double x = 3.0 ;
        double y = 4.0;
        double z = -5.0;
        double A,B,C;
        double delta;

        // RAIZ QUADRADA
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println(String.format("%f\n%f\n%f\n",A,B,C));

        //POTENCIA
        A = Math.pow(x,y);
        B = Math.pow(x,2.0);
        C = Math.pow(5.0,2.0);
        System.out.println(String.format("%f\n%f\n%f\n",A,B,C));

        //Valor absoluto é tirar o negativo se tiver
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println(String.format("%f\n%f\n",A,B));

        delta = Math.pow(B,2.0) - 4 * A * C;

        System.out.println((-B + Math.sqrt(delta)) / (2.0 * A));

    }
}
