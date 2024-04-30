package br.edu.up.Controle;

import java.util.Scanner;

import br.edu.up.Modelo.Passageiros;

public class ControlePassageiros {

    Scanner  scanner = new Scanner(System.in);
    
    private int quantidadePassageiros;
    private Passageiros[] passageiros = new Passageiros[quantidadePassageiros];
    

    private String cadastrarPassageiro() {

        System.out.println("----- Cadastro de Passageiro -----");

        Passageiros passageiros = new Passageiros();
        
        System.out.print("Nome do passageiro: ");
        passageiros.setNome(scanner.nextLine());

        System.out.print("RG do passageiro: ");
        passageiros.setRG(scanner.nextLine());
        
        System.out.print("Identificador da bagagem: ");
        passageiros.setIdentificadorBagagem(scanner.nextLine());
        
        quantidadePassageiros++;
        
        return "Passageiro cadastrado com sucesso!";
    }
    
}
