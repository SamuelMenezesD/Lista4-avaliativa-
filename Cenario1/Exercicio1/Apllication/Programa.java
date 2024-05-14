package Exercicio1.Apllication;

import Exercicio1.Domain.Livro;

public class Programa {

    public static void main(String[] args) {

        String AutoresLivro1[] = { "Cay S. Horstmann", "Gary Cornell" };

        Livro livroCoreJava = new Livro("1598FHK", "Core Java", AutoresLivro1, 2005, " 0130819336");

        String AutoresLivro2[] = { "Harvey Deitel" };

        Livro LivroJavaHow = new Livro("9865PLO", "Java, How to Program", AutoresLivro2, 2015, "0130341517");

        System.out.println(livroCoreJava.ShowLivro());

        System.out.println(LivroJavaHow.ShowLivro());
    }

}
