package br.edu.up.Controle;

import java.util.Scanner;

import br.edu.up.Modelo.Passageiros;
import br.edu.up.Modelo.Tripulacao;

public class ControleTripulacao {

    private static int quantidadetripulacao = 0;

    private static Tripulacao[] tripulacaos = new Tripulacao[quantidadetripulacao];

    private static Scanner scanner = new Scanner(System.in);

    public static String cadastrarTripulacao() {
        System.out.println("----- Cadastro de Tripulação -----");
        
        var Tripulacao = new Tripulacao(); 

        System.out.print("Nome do tripulante: ");
        Tripulacao.setNome(scanner.nextLine());
        
        System.out.print("Identificação aeronáutica: ");
        Tripulacao.setIdentificacaoAeronautica(scanner.nextLine());

        System.out.print("Matrícula do tripulante: ");
        Tripulacao.setMatricula(scanner.nextLine());
        
        tripulacaos[quantidadetripulacao] = Tripulacao;

        quantidadetripulacao++;

        return "Tripulação cadastrada com sucesso!";
    }

    public static void TodosTripualacao(){

        for (Tripulacao tripulacao2 : tripulacaos) {
            
            System.out.println(tripulacao2);

        }

    }
    
}
