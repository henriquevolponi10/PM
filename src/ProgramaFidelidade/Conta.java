package ProgramaFidelidade;

public class Conta {
    private static final int PONTOS_POR_VALOR = 100;
    private String titular;
    private double saldo;
    private int pontos;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.pontos = 0;
    }

    public void realizarTransacao(double valor) {
        if (valor != 0) {
            saldo += valor;
            adicionarPontos(valor);
        }
    }

    private void adicionarPontos(double valor) {
        int pontosGanhos = (int) Math.abs(valor) / PONTOS_POR_VALOR;
        this.pontos += pontosGanhos;
    }

    public String getTitular() {
        return titular;
    }

    public int getPontos() {
        return pontos;
    }

    public double getSaldo() {
        return saldo;
    }
}
