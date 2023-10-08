import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    private Scanner sc;
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Livro> livros = new ArrayList<>();
    
    public Biblioteca() {
        sc = new Scanner(System.in);
    }

    public void executar() {

        int escolha;

        do {

            System.out.println("--- Biblioteca Central ---");
            System.out.println("1 - Cadastrar usuario");
            System.out.println("2 - Buscar usuario cadastrado");
            System.out.println("3 - Listar usuarios cadastrados");
            System.out.println("4 - Cadastrar livro");
            System.out.println("5 - Buscar livro cadastrado");
            System.out.println("6 - Listar livros cadastrados");
            System.out.println("0 - Sair");
            System.out.println("--------------------------");
            System.out.print("Escolha uma opcao: ");

            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    buscarUsuario();
                    break;
                case 3:
                    listarUsuarios();
                    break;
                case 4:
                    cadastrarLivro();
                    break;
                case 5:
                    buscarLivro();
                    break;
                case 6:
                    listarLivros();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

        } while (escolha != 0);

    }

    private void cadastrarUsuario() {

        System.out.print("Digite o nome do usuario: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade do usuario: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o email do usuario: ");
        String email = sc.nextLine();

        System.out.print("Digite o numero identificador do usuario: ");
        int id = sc.nextInt();
        sc.nextLine();

        Usuario usuario = new Usuario(idade, nome, email, id);
        usuarios.add(usuario);
        System.out.println("Usuario cadastrado com sucesso!");
        System.out.println("");
    
    }

    private void buscarUsuario() {
        System.out.print("Digite o codigo identificador do usuario: ");
        int idDigitado = sc.nextInt();
        sc.nextLine();
    
        boolean encontrado = false;
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == idDigitado) {
                System.out.println("");
                System.out.println("Usuario encontrado!");
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("Idade: " + usuario.getIdade());
                System.out.println("Email: " + usuario.getEmail());
                System.out.println("Codigo: " + usuario.getId());
                System.out.println("");
                encontrado = true;
                break;
            }
        }
    
        if (!encontrado) {
            System.out.println("Usuario nao encontrado!");
            System.out.println("");
        }
    }

    private void listarUsuarios() {
        if (!usuarios.isEmpty()) {
            System.out.println("Usuarios cadastrados:");
            for (Usuario usuario : usuarios) {
                System.out.println("Nome: " + usuario.getNome());
            }
            System.out.println();
        } else {
            System.out.println("Nenhum usuário cadastrado até o momento!\n");
        }
    }
    
    

    private void cadastrarLivro() {

        System.out.print("Digite o titulo do livro: ");
        String titulo = sc.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = sc.nextLine();

        System.out.print("Digite o ano do livro: ");
        int ano = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a editora do livro: ");
        String editora = sc.nextLine();

        System.out.print("Digite o codigo identificador do livro: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        Livro livro = new Livro(ano, titulo, autor, editora, codigo);
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
        System.out.println("");
    }

    private void buscarLivro() {

        System.out.print("Digite o codigo identificador do livro: ");
        int codigoDigitado = sc.nextInt();
        sc.nextLine();
    
        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getCodigo() == codigoDigitado) {
                System.out.println("");
                System.out.println("Livro encontrado!");
                System.out.println("Titulo: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Ano: " + livro.getAno());
                System.out.println("Editora: " + livro.getEditora());
                System.out.println("Codigo: " + livro.getCodigo());
                System.out.println("");
                encontrado = true;
                break;
            }
        }
    
        if (!encontrado) {
            System.out.println("Livro nao encontrado!");
            System.out.println("");
        }
    }

    private void listarLivros() {
        if (!livros.isEmpty()) {
            System.out.println("Livros cadastrados:");
            for (Livro livro : livros) {
                System.out.println("Nome: " + livro.getTitulo());
            }
            System.out.println();
        } else {
            System.out.println("Nenhum livro cadastrado até o momento!\n");
        }
    }
}
