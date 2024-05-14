package Exercicio3.Apllication;

import Exercicio1.Domain.Livro;
import Exercicio3.Domain.Pilha;

public class Programa {

    public static void main(String[] args) {

        
        Pilha pilha = new Pilha(20);

        
        String AutoresLivro1[] = { "Cay S. Horstmann", "Gary Cornell" };

        Livro livroCoreJava = new Livro("1598FHK", "Core Java", AutoresLivro1, 2005, " 0130819336");

        pilha.push(livroCoreJava);

        System.out.println(pilha.toString());

    }

}
