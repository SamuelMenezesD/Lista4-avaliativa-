package br.up.edu.View;

import java.util.Scanner;

import br.up.edu.Controller.ClienteController;

public class Tela {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void exibirMenu() {
        boolean sair = false;

        while (!sair) {
            System.out.println("===== MENU =====");
            System.out.println("1. Incluir Cliente Pessoa");
            System.out.println("2. Incluir Cliente Empresa");
            System.out.println("3. Mostrar Dados Cliente Pessoa");
            System.out.println("4. Mostrar Dados Cliente Empresa");
            System.out.println("5. Emprestar Para Cliente Pessoa");
            System.out.println("6. Emprestar Para Cliente Empresa");
            System.out.println("7. Devolucao de Cliente Pessoa");
            System.out.println("8. Devolucao de Cliente Empresa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                
                

                ClienteController.AdicionarClientePessoa(null);

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
