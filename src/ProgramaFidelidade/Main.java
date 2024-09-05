package ProgramaFidelidade;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.adicionarConta(new Conta("Henrique", 1000.00));
        banco.adicionarConta(new Conta("Maria", 500.00));
        banco.adicionarConta(new Conta("José", 2000.00));

        banco.realizarTransacao(0, 250); // Henrique faz depósito
        banco.realizarTransacao(1, -150); // Maria faz saque
        banco.realizarTransacao(2, 500); // José faz depósito

        banco.determinarVencedorDoMes();
    }
}
