package emprestimodelivros;
import java.time.LocalDate;

public class SistemaEmprestimoLivros {
    public static void main(String[] args) {
        Livro livro = new Livro("12345", "Java: Como Programar");

        LocalDate dataEmprestimo = LocalDate.of(2024, 9, 1);
        LocalDate dataDevolucao = LocalDate.of(2024, 9, 16);

        Emprestimo emprestimo = new Emprestimo(livro, dataEmprestimo, dataDevolucao);

        long diasDeAtraso = emprestimo.calcularDiasDeAtraso();
        double valorMulta = emprestimo.calcularMulta();

        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Código de Identificação: " + emprestimo.getLivro().getCodigoIdentificacao());
        System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo());
        System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
        System.out.println("Número total de dias de atraso: " + diasDeAtraso);
        System.out.println("Valor total da multa: R$" + valorMulta);
    }
}
