import java.util.Scanner;
public class Cliente {
    String name;
    String tipoConta;
    double saldoInicial;

    public void ApresentarDados(){
        System.out.println("Nome: " + name);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial : " + saldoInicial);
    }

    public void ConsultarSaldo(){
        System.out.println("Seu saldo é: " + saldoInicial);
    }

    public void ReceberValor(double valor){
    saldoInicial += valor;
        System.out.println("Novo saldo: " +  saldoInicial);
    }

    public void TransferirValor(double valorTransferido){
        if(valorTransferido > saldoInicial){
            System.out.println("Não é possível transferir valor superior ao saldo disponível.");
        }else {
            saldoInicial -= valorTransferido;
            System.out.println("Novo saldo: " + saldoInicial);
        }
    }
}
