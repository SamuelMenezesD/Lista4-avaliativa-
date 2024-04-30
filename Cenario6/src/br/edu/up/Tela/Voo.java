package br.edu.up.Tela;

import java.util.Scanner;

import br.edu.up.Controle.ControlePassageiros;
import br.edu.up.modelos.Carro;

public class Voo {

    private Scanner scanner = new Scanner(System.in);
 
    public void Mostrarmenu() {
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
                cadastrarPassageiro();
                break;
            case 2:
                cadastrarTripulacao();
                break;
            case 3:
                consultarPassageiro();
                break;
            case 4:
                consultarTripulacao();
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
