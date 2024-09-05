package ProgramaFidelidade;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;
    private ProgramaDeFidelidade programaDeFidelidade;

    public Banco() {
        this.contas = new ArrayList<>();
        this.programaDeFidelidade = new ProgramaDeFidelidade();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void realizarTransacao(int index, double valor) {
        programaDeFidelidade.aplicarTransacao(contas.get(index), valor);
    }

    public void determinarVencedorDoMes() {
        Conta vencedora = programaDeFidelidade.determinarVencedor(contas);
        if (vencedora != null) {
            System.out.println("A conta vencedora do bônus é de: " + vencedora.getTitular() + " com " + vencedora.getPontos() + " pontos.");
        } else {
            System.out.println("Nenhuma conta foi a vencedora.");
        }
    }
}

