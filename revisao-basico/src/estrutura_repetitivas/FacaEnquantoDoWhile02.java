package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class FacaEnquantoDoWhile02  {
    public static void main(String[] args) {
        //Exercicio do FacaEnquantoDoWhile com o Do-While
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);


        char resposta;
        //faca
        do {
            System.out.println("Digite a temperatura em Celsius : ");
            double celsius = entrada.nextDouble();
            double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit : %.1f%n", fahrenheit);
            System.out.println("Deseja repetir (s/n)? ");
            resposta = entrada.next().charAt(0);
         //enquanto
        }while (resposta != 'n');

    }
}
