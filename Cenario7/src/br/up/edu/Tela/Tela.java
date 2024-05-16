package br.up.edu.Tela;
import java.util.Scanner;
import br.up.edu.Controle.Controle;

public class Tela {
    private Controle controle;
    private Scanner scanner;

    public Tela() {
        controle = new Controle();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        boolean sair = false;

        while (!sair) {
            System.out.println("===== MENU =====");
            System.out.println("1. Adicionar Professor");
            System.out.println("2. Verificar Situação do Aluno");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                adicionarProfessor();
                
                    break;
                case 2:
                
                verificarSituacaoAluno();
                
                break;
                
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    
}
