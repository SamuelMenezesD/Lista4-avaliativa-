package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.controles.ControlEstatico;
import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Estacionamento;

public class TelaEstacionamento {


   private static Scanner leitor = new Scanner(System.in);

    public static boolean Mostrarmenu() {
       
        System.out.println();
        System.out.println("-----------------");
        System.out.println("  MENU INICIAL");
        System.out.println("-----------------");
        System.out.println();
        System.out.println("Digite o número da opção:");
        System.out.println();

        System.out.println("1. Entrada de Veiculo");
        System.out.println("2. Saída de Veiculo");
        System.out.println("3. Gerar Relatorio");

        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:

                Carro carro = new Carro();

                leitor.nextLine();
                System.out.println("Insira Placa do Carro");
                carro.setPlaca(leitor.nextLine());

                System.out.println("Insira o Modelo do Carro: ");
                carro.setModelo(leitor.nextLine());

                System.out.println("Insira a Cor do Carro: ");
                carro.setCor(leitor.nextLine());

                ControlEstatico.estacionaCarro(carro);

            case 2: {

                leitor.nextLine();
                System.out.println("Retirar Carro Favor Informar A Placa: ");
                String placa = leitor.nextLine();

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
                    return false;
                
        }

        return true;

    }

}
