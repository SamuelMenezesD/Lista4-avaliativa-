package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.controle.ContoleReserva;
import br.edu.up.controles.ControlEstatico;
import br.edu.up.modelo.Pessoa;
import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Estacionamento;

public class TelaEvento {


    Scanner leitor = new Scanner(System.in);

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

                ControlEstatico.estacionaCarro(carro);

            case 2: {

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
                break;
        }

    }

    public void MenuAlteracaoReserva() {
        System.out.println();
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println();
        System.out.println("Digite o número da opção:");
        System.out.println();

        System.out.println("1. Mudar Nome Responsavel");
        System.out.println("2. Mudar Pessoas");
        System.out.println("3. Mudar Data Reserva");

        int opcao = leitor.nextInt();
        int id = 0;

        switch (opcao) {
            case 1:

                System.out.println("Informe o nome novo:");
                String nomeNovo = leitor.nextLine();

            ContoleReserva.AlterarNomeReserva(id, nomeNovo);

            break;
              
            case 2: {

                int x = 0;

                //TODO : Array pessoas implementar e ID
                Pessoa[] pessoas = new Pessoa[x];

                ContoleReserva.AlterarPessoasReserva(id, pessoas);

                break;
            }
            case 3: {

                System.out.println("Informe a data nova: ");
                String data = leitor.nextLine();

                ContoleReserva.AlterarDataReserva(data, id);
                break;
            }
            default:
            

                break;
        }

    }


}
