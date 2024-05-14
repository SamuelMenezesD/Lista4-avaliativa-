package Exercicio3.Domain;
import java.util.Scanner;

import Exercicio1.Domain.Livro;

public class Menu {

    private static Pilha pilha;

    private static final Livro livro = new Livro();

    private static final Scanner scanner = new Scanner(System.in);

    public static void StartMenu(){

        System.out.println("Informe o Tamanho da Pilha: ");
        int tam = scanner.nextInt();

        pilha = new Pilha(tam);

        int opcao;

        do{

            System.out.printf("\n     (1)Inserir Livro     \n \n     (2)Remover Livro     \n \n     (3)Vizualizar Ultimo Livro     \n \n     (4)Listar Todos os Livros     \n \n     (5)Sair     \n");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    pilha.push(livro.CriarLivro());
                    break;
                case 2: 
                    pilha.Pop();
                    break;
                case 3: 
                    pilha.Peek();
                    break;
                case 4: 
                    System.out.println(pilha.toString()); 
                    break;
                case 5:
                    System.out.println("Adeus!");
                    break;    
                default:
                        System.out.println("Informe um numero valido");
                    break;
            }

        }while(opcao != 5);

    }


}
