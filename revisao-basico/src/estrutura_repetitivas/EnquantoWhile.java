package estrutura_repetitivas;

import java.util.Scanner;

public class EnquantoWhile {
    public static void main(String[] args) {
        // quando vai usar ? quando NÃO se sabe a quantidade de repetições que será realizada.

        // fazer um programa que lê números inteiros até que zero seja. ao final mostra a soma dos numeros lidos.

        Scanner entrada = new Scanner(System.in);
        int numero;
        int soma  = 0;

        numero = entrada.nextInt(); // fazendo a leitura do primeiro valor


        //enquanto
        while (numero != 0 ){ //

            soma += numero;

            numero = entrada.nextInt(); //fazendo a leitura dos valores seguintes
        }
        System.out.println(soma);

    }
}
