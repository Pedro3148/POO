package atividade3;
import java.util.Scanner;

 public class Sistema {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        int opcao = 0;

        Scanner scanner = new Scanner(System.in);
        while (opcao != 5) {
            System.out.println("1 - Adicionar objeto");
            System.out.println("2 - Remover objeto");    
            System.out.println("3 - Listar Estoque");
            System.out.println("4 - Atualizar Qtd. de um objeto");
            System.out.println("5 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            executarOpcao(opcao, scanner, estoque);
        }
        scanner.close();
        System.out.println("Sistema fechado.");
    }    
    
    public static void executarOpcao(int opcao, Scanner scanner, Estoque estoque){
        String nome = "";
        int qtd = 0;
        switch (opcao) {
            case 1:
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                System.out.print("Qtd: ");
                qtd = scanner.nextInt();
                Objeto o = new Objeto(nome, qtd);
                estoque.adicionarObjeto(o);
                break;
            case 2:
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                estoque.removerObjeto(nome);
                break;
            case 3:
                System.out.println(estoque.listarEstoque());
                break;
            case 4:
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                System.out.print("Qtd: ");
                qtd = scanner.nextInt();
                estoque.atualizarQtd(nome, qtd);
                break;
        }

    }
 }