public class Livro {
    
    private int ano;
    private String titulo;
    private String autor;
    private String editora;
    private int codigo;

    public Livro(int ano, String titulo, String autor, String editora, int codigo) {
        this.ano = ano;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getCodigo() {
        return codigo;
    }
}
