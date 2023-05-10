import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static int escolha;
    static double valor;
    static double valorTransferido;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("****************************");
        System.out.println("Dados inicias do cliente: ");

        Cliente cliente = new Cliente();
        cliente.name = "Edgar Elias";
        cliente.saldoInicial = 2500.00;
        cliente.tipoConta = "Corrente";

        cliente.ApresentarDados();

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    cliente.ConsultarSaldo();
                    break;
                case 2:
                    System.out.println("Insira o valor que irá receber:");
                    valor = entrada.nextDouble();
                    cliente.ReceberValor(valor);
                    break;
                case 3:
                    System.out.println("Insira o valor que irá transferir: ");
                    valorTransferido = entrada.nextDouble();
                    cliente.TransferirValor(valorTransferido);
                    break;
                case 4:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Escolha uma opção existente.");
            }
     } while(escolha != 4);
    }
}