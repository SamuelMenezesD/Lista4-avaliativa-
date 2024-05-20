package br.edu.up.Controle;

import java.util.Scanner;

import br.edu.up.Modelo.Passageiros;

public class ControlePassageiros {

   private static Scanner scanner = new Scanner(System.in);
    
    private static int quantidadePassageiros;
    private static  Passageiros[] passageiros = new Passageiros[quantidadePassageiros];
    

    public static String cadastrarPassageiro() {

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

    public static void TodosPassageiro(){

        for (Passageiros passageiros2 : passageiros) {
            
            System.out.println(passageiros2);

        }

    }
    
}
