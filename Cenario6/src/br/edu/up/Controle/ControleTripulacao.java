package br.edu.up.Controle;

import java.util.Scanner;

import br.edu.up.Modelo.Passageiros;
import br.edu.up.Modelo.Tripulacao;

public class ControleTripulacao {

    private int quantidadetripulacao;

    private Tripulacao[] tripulacaos = new Tripulacao[quantidadetripulacao];

    Scanner scanner = new Scanner(System.in);

    private String cadastrarTripulacao() {
        System.out.println("----- Cadastro de Tripulação -----");
        
        System.out.print("Nome do tripulante: ");
        tripulacaos.setNome(scanner.nextLine());
        
        System.out.print("RG do tripulante: ");
        tripulacaos.setRg(scanner.nextLine());
        
        System.out.print("Identificação aeronáutica: ");
        tripulacaos.setIdentificacaoAeronautica(scanner.nextLine());

        System.out.print("Matrícula do tripulante: ");
        tripulacaos.setMatricula(scanner.nextLine());
        
        Tripulacao tripulacao = new Tripulacao[quantidadetripulacao](nome, rg, identificacaoAeronautica, matricula);
        
        return "Tripulação cadastrada com sucesso!";
    }
    
}
