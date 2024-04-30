package br.edu.up.Modelo;

import java.util.Scanner;

public class Comissarios extends Tripulacao{

    private String[] Idiomas;

    public String[] getIdiomas() {
        return Idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        Idiomas = idiomas;
    }

    

    public Comissarios() {
    
        CriarIdiomas();

    }

    private void CriarIdiomas(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de idiomas: ");
        int quant = scanner.nextInt();

        this.Idiomas = new String[quant];

        for (int i = 0; i < Idiomas.length; i++) {
            
            System.out.println("Informe o idioma: ");
            String idioma = scanner.nextLine();
            Idiomas[i] = idioma;

        }
        scanner.close();
    }

}
