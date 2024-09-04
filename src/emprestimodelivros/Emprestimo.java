package emprestimodelivros;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    private static final int PRAZO_DEVOLUCAO = 14;
    private static final double MULTA_DIARIA = 0.50;

    public Emprestimo(Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public long calcularDiasDeAtraso() {
        LocalDate dataPrazo = dataEmprestimo.plusDays(PRAZO_DEVOLUCAO);
        if (dataDevolucao.isAfter(dataPrazo)) {
            return ChronoUnit.DAYS.between(dataPrazo, dataDevolucao);
        }
        return 0;
    }

    public double calcularMulta() {
        long diasDeAtraso = calcularDiasDeAtraso();
        return diasDeAtraso * MULTA_DIARIA;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
}
