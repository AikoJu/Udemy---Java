package secao5;

public class ExpressaoCondicionalTernaria {
    public static void main(String[] args) {
        double desconto,preco = 34.5;

        if (preco < 20){
            desconto = preco * 0.1;
        }
        else {
            desconto = preco * 0.5;
        }

        desconto = (preco < 20)? preco * 0.1 : preco * 0.5 ;

        System.out.println(desconto);
    }
}
