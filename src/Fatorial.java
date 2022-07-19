public class Fatorial {
    public static void main(String[] args) {
        int fat =1;
        for (int numero = 1; numero<=11; numero++){
            fat *= numero;
            System.out.println("O Fatorial de "+ numero +  " é de  " + fat);
        }
    }
}
