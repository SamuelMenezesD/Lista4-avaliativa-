package br.edu.up.Tela;

import java.util.Scanner;

import br.edu.up.Controle.ControlePassageiros;
import br.edu.up.Controle.ControleTripulacao;
public class Voo {

    private static Scanner scanner = new Scanner(System.in);
 
    public static void Mostrarmenu() {
        System.out.println("----- Menu -----");
        System.out.println("1. Cadastrar passageiro");
        System.out.println("2. Cadastrar tripulação");
        System.out.println("3. Consultar passageiro");
        System.out.println("4. Consultar tripulação");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                ControlePassageiros.cadastrarPassageiro();
                break;
            case 2:
                ControleTripulacao.cadastrarTripulacao();
                break;
            case 3:
                ControlePassageiros.TodosPassageiro();
                break;
            case 4:
                ControleTripulacao.TodosTripualacao();
                break;
            case 5:
                System.out.println("Encerrando o programa...");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
        
        }

    }

}
