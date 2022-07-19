import java.util.Locale;

public class TestePontoFlutuante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


         double salario = 1250.70;

        System.out.println("Meu salario = " + salario);
        // NUMERO TIPO int é compartivel com double
        double idade = 37;
        System.out.println(idade); // ira imprimir 37.0

        double divisao = 3.14 / 2;
        System.out.println(divisao);

        int outraDivisao = 5 / 2;
        System.out.println(outraDivisao); // int com int = int

        double novaTentativa = 5.0 / 2 ;
        System.out.println(novaTentativa);


    }
}
