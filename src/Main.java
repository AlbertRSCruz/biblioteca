import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locacao locacao = new Locacao();
        int opcao;
        do{
            System.out.println("1 - Cadastrar funcionário ");
            System.out.println("2 - Cadastrar usuário");
            System.out.println("3 - Cadastrar livro");
            System.out.println("4 - Mostrar todos os dados do cadastro");
            System.out.println("5 - Ir para a locação");
            System.out.println("0 - Sair");
            System.out.println("Digite aqui a opção");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    System.out.println(":::::::::::::::::::::Bem vindo ao menu funcionario:::::::::::::::::::::");
                    System.out.println("Digite seu nome:");
                    locacao.getFuncionario().setNome(scanner.next());
                    System.out.println("Digite seu cpf:");
                    locacao.getFuncionario().setCpf(scanner.nextLong());
                    System.out.println("Digite seu cargo");
                    locacao.getFuncionario().setCargo(scanner.next());
                    System.out.println("Digite seu salario");
                    locacao.getFuncionario().setSalario(scanner.nextDouble());
                    System.out.println("Digite seu endereço, sua rua:");
                    locacao.getFuncionario().getEndereco().setRua(scanner.next());
                    System.out.println("Digite seu bairro");
                    locacao.getFuncionario().getEndereco().setBairro(scanner.next());
                    System.out.println("Digite seu numero");
                    locacao.getFuncionario().getEndereco().setNumero(scanner.nextInt());
                case 2:
                    System.out.println(":::::::::::::::::::::Bem vindo ao menu funcionario:::::::::::::::::::::");
                    System.out.println("Cadastrar usuário:");
                    //nome codigo cpf endereco
                    System.out.println("Digite seu nome");
                    locacao.getUsuario().setNome(scanner.next());
                    System.out.println("Digite seu codigo");
                    locacao.getUsuario().setCodigo(scanner.nextInt());
                    System.out.println("Digite seu CPF");
                    locacao.getUsuario().setCpf(scanner.nextLong());
                    System.out.println("Digite seu endereço,seu bairro");
                    locacao.getUsuario().getEndereco().setBairro(scanner.next());
                    System.out.println("Digite seu numero");
                    locacao.getUsuario().getEndereco().setNumero(scanner.nextInt());
                    System.out.println("Digite sua rua");
                    locacao.getUsuario().getEndereco().setRua(scanner.next());

                case 3:
                    System.out.println(":::::::::::::::::::::Bem vindo ao menu cadastro livro:::::::::::::::::::::");
                    System.out.println("Cadastrar Titulo:");
                    locacao.getLivro().setTitulo(scanner.next());
                    System.out.println("Cadastrar Autor");
                    locacao.getLivro().setAutor(scanner.next());
                    System.out.println("Cadastre o genero");
                    locacao.getLivro().setGenero(scanner.next());

                case 4:
                    System.out.println(":::::::::::::::::::::Bem vindo ao menu usuário:::::::::::::::::::::");
                    System.out.println("Mostrar todos os dados do cadastro");

                case 5:
                    System.out.println(":::::::::::::::::::::Bem vindo ao menu usuário:::::::::::::::::::::");
                    break;

            }
        }while(opcao !=0);
    }
}
//REVISAR O ARQUIVO UML E REFATORAR AS CLASSES COM AS VARIÁVEIS CORRETAS.
//CRIAR O MENU INICIAL
//git add .
//git commit -m "mensagem"
//git push
//git status