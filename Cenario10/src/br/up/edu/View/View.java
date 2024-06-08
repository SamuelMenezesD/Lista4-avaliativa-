package br.up.edu.View;

import java.util.Scanner;

import br.up.edu.Controller.SeguroController;

public class View {
    private SeguroController controller;
    private Scanner scanner;

    public View(SeguroController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int option;

        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Incluir seguro");
            System.out.println("2. Localizar seguro");
            System.out.println("3. Excluir seguro");
            System.out.println("4. Excluir todos os seguros");
            System.out.println("5. Listar todos os seguros");
            System.out.println("6. Ver quantidade de seguros");
            System.out.println("7. Sair");
            System.out.println("-----------------");
            System.out.println("Digite a opção desejada: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    controller.incluirSeguro();
                    break;
                case 2:
                    controller.localizarSeguro();
                    break;
                case 3:
                    controller.excluirSeguro();
                    break;
                case 4:
                    controller.excluirTodosSeguros();
                    break;
                case 5:
                    controller.listarTodosSeguros();
                    break;
                case 6:
                    controller.quantidadeSeguros();
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (option != 7);
    }
}