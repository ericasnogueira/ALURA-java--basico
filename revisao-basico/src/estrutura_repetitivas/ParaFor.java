package estrutura_repetitivas;

import java.util.Scanner;

public class ParaFor {
    public static void main(String[] args) {
        // quando usar : quando se SABE PREVIAMENTE A QUANTIDADE DE REPETI��ES, ou o intervalo de valores

        //estrura for :
        // inicio - vai ser executado somente na primeira vez
        // condi��o - V : executa e volta / F: pula fora
        // incremento - executa toda vez depois de voltar

        //for(inicio;codi��o; incremento){
        //  comando 1
        //  comando 2
        //}

        /*
        Fazer um programa de l� um valor inteiro N e depois N n�meros inteiros. Ao final, mostra a soma dos N  n�meros
        lidos
         */

        Scanner entrada = new Scanner(System.in);

        int numeros = entrada.nextInt();
        int soma = 0;

                     //codi��o - vou repeti esse bloco enquanto i for menor do que n
        for(int i =0; i < numeros;i++){
            int leitura = entrada.nextInt(); // lendo a varialvel
            soma += leitura;
        }

        System.out.println(soma);
    }
}
