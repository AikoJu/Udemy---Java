package secao4;

public class ExercicioFixacao1 {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        Integer age = 30;
        Integer code = 5290;
        char gender = 'F';

        Double price1 = 2100.00;
        Double price2 = 650.50;
        Double measure = 53.234567;

        System.out.println("""
                Products:
                %s, which price is R$%.2f 
                %s, which price is R$%.2f
                
                Record: %d years old, code %d and gender: %c 
                
                Measure with eight decimal places: %f
                Rounded(Three decimal places): %.3f
                """.formatted(product1,price1,product2,price2,age,code,gender,measure,measure));


    }
}
