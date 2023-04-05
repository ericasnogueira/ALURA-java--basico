import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        //tipos de dados
        String nome  = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;

        System.out.println("*************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: "+ nome);
        System.out.println("Tipo Conta: "+ tipoConta);
        System.out.printf("Saldo inicial : %.2f", saldoInicial);
        System.out.println("\n*************************");

        String menu = "\nOperações  \n " +
                      "\n1- Consultar saldos\n" +
                      "2- Receber valor\n" +
                      "3- Transferir valor\n" +
                      "4- Sair\n" +
                      "\n Digite a opção desejada:";

        System.out.println(menu);
        int opcao = entrada.nextInt();

        while (opcao != 4){
            double valorReceber;
            double valorTransferido;

            switch (opcao){
                case 1 :
                    System.out.printf("O saldo atual é : %.2f", saldoInicial);
                    break;
                case 2 :
                    System.out.println("Digite o valor a receber:");
                    valorReceber = entrada.nextDouble();
                    System.out.printf("Saldo atualizado R$ %.1f", saldoInicial +=valorReceber);
                    break;

                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    valorTransferido= entrada.nextDouble();

                    if (valorTransferido > saldoInicial) {
                        System.out.println("Não há saldo suficiente para fazer essa transferencia");
                    } else {
                        System.out.printf("Saldo atualizado R$ %.1f", saldoInicial -= valorTransferido);
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println();// pulando uma lilha
            //chamando o menu novamente
            System.out.println(menu);

            opcao = entrada.nextInt();
        }
    }
}
