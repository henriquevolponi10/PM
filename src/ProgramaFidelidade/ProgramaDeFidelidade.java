package ProgramaFidelidade;
import java.util.List;

public class ProgramaDeFidelidade {
    public void aplicarTransacao(Conta conta, double valor) {
        conta.realizarTransacao(valor);
    }

    public Conta determinarVencedor(List<Conta> contas) {
        Conta vencedora = null;
        int maxPontos = 0;

        for (Conta conta : contas) {
            if (conta.getPontos() > maxPontos) {
                maxPontos = conta.getPontos();
                vencedora = conta;
            }
        }
        return vencedora;
    }
}
