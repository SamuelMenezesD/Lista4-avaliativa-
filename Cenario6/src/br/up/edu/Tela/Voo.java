package br.up.edu.Tela;

import java.util.Scanner;

public class Voo {

    private Scanner scanner = new Scanner(System.in);
 
    public void Mostrarmenu() {
        System.out.println();
        System.out.println("-----------------");
        System.out.println("  MENU INICIAL");
        System.out.println("-----------------");
        System.out.println();
        System.out.println("Digite o número da opção:");
        System.out.println();

        System.out.println("1. Gerar Reserva");
        System.out.println("2. Saída de Veiculo");
        System.out.println("3. Gerar Relatorio");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:

                Carro carro = new Carro();

                System.out.println("Insira Placa do Carro");
                carro.setPlaca(scanner.nextLine());

                System.out.println("Insira o Modelo do Carro: ");
                carro.setModelo(scanner.nextLine());

                System.out.println("Insira a Cor do Carro: ");
                carro.setCor(scanner.nextLine());

                ControlEstatico.estacionaCarro(carro);

            case 2: {

                System.out.println("Retirar Carro Favor Informar A Placa: ");
                String placa = scanner.nextLine();

                ControlEstatico.RetirarCarro(placa);

                System.out.println("Carro Retirado");

                break;
            }
            case 3: {

                System.out.println(("Gerar relatorio"));
                ControlEstatico.GerarRelatorio();

                break;
            }
            default:
                break;
        }

    }

}
