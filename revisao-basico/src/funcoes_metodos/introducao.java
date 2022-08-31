package funcoes_metodos;

import java.util.Scanner;

public class introducao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        int maior = max(a, b, c);
        showResultado(maior);

    }

    // função/metodo
    public static int max(int x, int y, int z){
        int aux;
        if(x > y && x > z){
            aux = x;
        } else if (y > z) {
            aux = y;
        } else{
            aux = z;
        }
        return aux;
    }

    public  static void showResultado(int valor){
        System.out.println("Maior = " + valor);
    }
}
