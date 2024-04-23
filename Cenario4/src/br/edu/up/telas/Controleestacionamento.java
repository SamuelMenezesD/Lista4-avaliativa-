package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.controles.ControlEstatico;
import br.edu.up.modelos.Carro;

public class Controleestacionamento {
    Scanner leitor = new Scanner(System.in);

    public void Mostrarmenu() {
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

                System.out.println("Insira Placa do Carro");
                carro.setPlaca(leitor.nextLine());

                System.out.println("Insira o Modelo do Carro: ");
                carro.setModelo(leitor.nextLine());

                System.out.println("Insira a Cor do Carro: ");
                carro.setCor(leitor.nextLine());

                System.out.println("Insira O Horario de Entrada do Carro: ");
                carro.setEntrada(leitor.nextInt());
                break;
            case 2: {

                System.out.println("Retirar Carro Favor Informar A Placa: ");
                String placa = leitor.nextLine();

                System.out.println("Insira a saida: (0) Manha (1) Tarde (2) Noite");
               // carro.setSaida(leitor.nextInt());
                
                ControlEstatico.RetirarCarro(placa);

                System.out.println("Carro Retirado");

                break;
            }
            case 3: {

                break;
            }
            default:
                break;
        }

    }

}
