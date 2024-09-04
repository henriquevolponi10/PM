package contabancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("12345", "123.456.789-00", 100.0);
        System.out.println("Saldo inicial: R$" + conta1.getSaldo());
        conta1.depositar(200.0);
        System.out.println("Saldo após depósito: R$" + conta1.getSaldo());
        conta1.sacar(250.0);
        System.out.println("Saldo após saque: R$" + conta1.getSaldo());
        conta1.depositar(150.0);
        System.out.println("Saldo final: R$" + conta1.getSaldo());
    }
}
