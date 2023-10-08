public class Usuario {

    private int idade;
    private String nome;
    private String email;
    private int id;

    public Usuario(int idade, String nome, String email, int id) {
        this.idade = idade;
        this.nome = nome;
        this.email = email;
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
}
