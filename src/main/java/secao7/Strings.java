package secao7;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG  ";

        String lowerCase = original.toLowerCase();
        String upperCase = original.toUpperCase();
        String trim = original.trim();
        String subString = original.substring(2);
        String subString2 = original.substring(2,9);
        String replace = original.replace("ABC","Ball");
        Integer i = original.indexOf("bc");
        Integer j = original.lastIndexOf("bc");

        String original2 = "potato apple lemon";
        String [] vect = original2.split(" ");
        String primeira = vect[0];
        String segunda = vect[1];
        String terceira = vect[2];

        System.out.println("""
                %s
                %s
                %s
                %s
                %s
                %s
                %s
                %d
                %d
                
                %s
                %s
                %s
                %s""".formatted(original,lowerCase,upperCase,trim,subString,subString2,replace,i,j,vect,primeira,segunda,terceira));



    }
}
