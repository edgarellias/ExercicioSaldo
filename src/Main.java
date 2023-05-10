import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static int escolha;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("****************************");
        System.out.println("Dados inicias do cliente: ");

        Cliente cliente = new Cliente();
        cliente.name = "Edgar Elias";
        cliente.saldoInicial = 2500.00;
        cliente.tipoConta = "Corrente";

        cliente.ApresentarDados();
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Consultar saldos");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");

        System.out.println("4 - Sair");
        while(escolha != 4) {
            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("1 - Consultar saldos");
                    break;
                case 2:
                    System.out.println("2 - Receber valor");
                    break;
                case 3:
                    System.out.println("3 - Transferir valor");
                    break;
                case 4:
                    System.out.println("4 - Sair");
                    break;
                default:
                    System.out.println("Escolha uma opção existente.");
            }
        }

    }
}