package br.edu.up;

import java.util.Scanner;

import br.edu.up.Tela.*;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);  

        do{

            Tela.exibirMenu();

            System.out.println("0 para sair ou Qualquer Numero Para Continuar");

        }while(scanner.nextInt() != 0 );

    }
}
