package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class FacaEnquantoDoWhile {
    public static void main(String[] args) {
        //menos utilizada, mas alguns casos se encaixa melhor ao problema.
        //o bloco de comando executa pelo menos uma vez,pois a condição é verificada no final
        /*
        //faca
            do {
                comando 1
                comando 2
              //enquanto
            } while (condição);

         */
        /*
        Problema exemplo :
        Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit. Perguntar se o
        usuário deseja repetir(s/n). Caso o usuário digite "s",repetir o programa.
         */ // exemplo terá duas formas de fazer com While e doWhile
        // exemplo na forma While

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius : ");
        double celsius = entrada.nextDouble();
        double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
        System.out.printf("Equivalente em Fahrenheit : %.1f%n", fahrenheit);
        System.out.println("Deseja repetir (s/n)? ");
        char resposta = entrada.next().charAt(0);

        while (resposta != 'n'){
            System.out.println("Digite a temperatura em Celsius : ");
            celsius = entrada.nextDouble();
            fahrenheit = 9.0 * celsius / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit : %.1f%n", fahrenheit);
            System.out.println("Deseja repetir (s/n)? ");
            resposta = entrada.next().charAt(0);
        }
    }
}
