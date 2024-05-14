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
                    String nome = scanner.next();
                    System.out.println("Digite seu CPF");
                    long cpf = scanner.nextLong();
                    System.out.println("Digite o salario");
                    double salario= scanner.nextDouble();
                    Endereco endereco=scanner.next()
                    break;
                    //LEIA O NOME QUE O FUNCIONARIO VAI DIGITAR

                case 2:
                    System.out.println(":::::::::::::::::::::Bem vindo ao menu usuário:::::::::::::::::::::");
                    System.out.println("Cadastrar usuário:");
                    String usuario = scanner.next();

                    //LEIA O NOME QUE O USUARIO VAI DIGITAR
                    //E ASSIM CRIE OS OUTROS CASES

                case 3:
                    System.out.println(":::::::::::::::::::::Bem vindo ao menu usuário:::::::::::::::::::::");
                    System.out.println("Cadastrar livro:");
                    String livro = scanner.next();


                case 4:
                    System.out.println(":::::::::::::::::::::Bem vindo ao menu usuário:::::::::::::::::::::");
                    System.out.println("Mostrar todos os dados do cadastro");
                    



                case 5:
                    System.out.println(":::::::::::::::::::::Bem vindo ao menu usuário:::::::::::::::::::::");
                    System.out.println("Ir para a locação");
                    String local = scanner.next();
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