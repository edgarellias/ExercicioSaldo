public class Cliente {
    String name;
    String tipoConta;
    double saldoInicial;

    public void ApresentarDados(){
        System.out.println("Nome: " + name);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial : " + saldoInicial);
    }
}
