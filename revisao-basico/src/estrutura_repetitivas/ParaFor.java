package estrutura_repetitivas;

import java.util.Scanner;

public class ParaFor {
    public static void main(String[] args) {
        // quando usar : quando se SABE PREVIAMENTE A QUANTIDADE DE REPETIÇÕES, ou o intervalo de valores

        //estrura for :
        // inicio - vai ser executado somente na primeira vez
        // condição - V : executa e volta / F: pula fora
        // incremento - executa toda vez depois de voltar

        //for(inicio;codição; incremento){
        //  comando 1
        //  comando 2
        //}

        /*
        Fazer um programa de lê um valor inteiro N e depois N números inteiros. Ao final, mostra a soma dos N  números
        lidos
         */

        Scanner entrada = new Scanner(System.in);

        int numeros = entrada.nextInt();
        int soma = 0;

                     //codição - vou repeti esse bloco enquanto i for menor do que n
        for(int i =0; i < numeros;i++){
            int leitura = entrada.nextInt(); // lendo a varialvel
            soma += leitura;
        }

        System.out.println(soma);
    }
}
