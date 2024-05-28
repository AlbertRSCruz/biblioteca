import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Object locacao;

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
                    locacao.getFuncionario().setcpf(scanner.nextLong());
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
                    break;

                case 2:
                    System.out.println(":::::::::::::::::::::Bem vindo ao menu funcionario:::::::::::::::::::::");
                    System.out.println("Cadastrar usuário:");
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
                    break;

                case 3:
                    System.out.println(":::::::::::::::::::::Bem vindo ao menu cadastro livro:::::::::::::::::::::");
                    System.out.println("Cadastrar Titulo:");
                    locacao.getlivro().setTitulo(scanner.next());
                    System.out.println("Cadastrar Autor");
                    locacao.getlivro().setAutor(scanner.next());
                    System.out.println("Cadastre o genero");
                    locacao.getlivro().setGenero(scanner.next());
                    break;

                case 4:
                       do{
                        System.out.print("Selecione o cadastro na qual o mesmo queira acessar: \n"
                                + "1 - Cadastro do Funcionário: \n"
                                + "2 - Cadastro do Usuário \n"
                                + "3 - Cadastro do livro\n"
                                + "9 - Voltar ao menu principal\n"
                                + "Digite a opção desejada: ");
                        opcao = scanner.nextInt();
                        switch (opcao){
                            case 1:
                                System.out.println(locacao.getFuncionario().toString());
                                break;
                            case 2:
                                System.out.println(locacao.getUsuario().toString());
                                break;
                            case 3:
                                System.out.println(locacao.getlivro().toString());
                                break;
                            default:
                                System.out.println("Opção invalida");
                                break;
                        }

                    }while (opcao!=9);

                case 5:
                   do {
                       System.out.print("\n::::::::::::::::: Sistema de Locação ::::::::::::::::::\n" +
                               "  Escolha uma opção abaixo\n" +
                               "  [1] - Locar livro\n" +
                               "  [2] - Devolver livro\n" +
                               "  [3] - Mostrar os dados do livro locado\n" +
                               "  [4] - Mostra os dados do livro devolvido\n" +
                               "  [5] - Sair da locação\n" +
                               "  Digite aqui a opção: \n");
                       opcao = scanner.nextInt();
                       switch (opcao){
                           case 1:
                               System.out.println("Digite o titulo do livro");
                               Locacao.getlivro().setTitulo(scanner.next());
                               System.out.println("Digite o autor do livro");
                               locacao.getlivro().setAutor(scanner.next());
                               System.out.println("Digite o genero do livro");
                               locacao.getlivro().setGenero(scanner.next());
                               break;

                           case 2:
                               System.out.println("Digite o titulo do livro");
                               locacao.getlivro().setTitulo(scanner.next());
                               System.out.println("Digite o autor do livro");
                               locacao.getlivro().setAutor(scanner.next());
                               System.out.println("Digite o genero do livro");
                               locacao.getlivro().setGenero(scanner.next());
                               break;

                           case 3:
                               System.out.println(locacao.getlivro().toString());
                               break;
                           case 4:
                               System.out.println(locacao.getlivro().toString());
                               break;

                           default:
                               System.out.println("opcao invalida");
                       }

                   }while (opcao!=5);

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