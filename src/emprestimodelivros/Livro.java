package emprestimodelivros;
public class Livro {
    private String codigoIdentificacao;
    private String titulo;

    public Livro(String codigoIdentificacao, String titulo) {
        this.codigoIdentificacao = codigoIdentificacao;
        this.titulo = titulo;
    }

    public String getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public String getTitulo() {
        return titulo;
    }
}
