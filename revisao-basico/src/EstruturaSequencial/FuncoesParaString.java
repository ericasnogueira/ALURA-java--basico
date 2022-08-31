package EstruturaSequencial;

import java.util.Locale;

public class FuncoesParaString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();


        System.out.println("Original : " + original); //original
        System.out.println("ToLowerCase : " + s01); // minuscula
        System.out.println("ToUpperCase : " + s02); // maiuscula

    }
}
