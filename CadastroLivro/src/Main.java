import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> listarLivro = new ArrayList<>();
        Livro metodoLivro = new Livro();

        System.out.println("Sistema de Cadastro de Livros");

        Scanner leitor = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Opcao: 1 - Cadastrar Livro / 2 - Sair");
            opcao = leitor.nextLine();

            switch (opcao) {
                case "1":

                    String opcaoLivro;

                    do {
                        System.out.println("Digite a opcao: 1 - Cadastrar Livro / 2 - Listar Livro / 0 - Voltar");
                        opcaoLivro = leitor.nextLine();

                        switch (opcaoLivro){
                            case "1":
                                Livro novoLivro = new Livro();
                                Autor novoAutor = new Autor();

                                System.out.println("Digite o Titulo:");
                                novoLivro.titulo = leitor.nextLine();

                                System.out.println("Digite o Autor:");
                                novoLivro.autor = leitor.nextLine();

                                System.out.println("Digite o preco");
                                novoLivro.preco = leitor.nextLine();

                                System.out.println("Digite a data de lancamento:(dd/mm/aaaa)");
                                novoLivro.dataLancamento = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));


                        }

                    }

            }
        }
    }
}