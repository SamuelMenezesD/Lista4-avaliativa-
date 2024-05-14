package Exercicio3.Domain;

import java.util.Arrays;

import Exercicio1.Domain.*;

public class Pilha {

    private int TamanhoPilha;

    private int ItensPilha = 0;

    private Livro[] PilhaLivros;

    public Pilha(int tamanhoPilha) {

        TamanhoPilha = tamanhoPilha;
        this.PilhaLivros = new Livro[TamanhoPilha];

    }

    public void push(Livro livro) {

        if (this.ItensPilha == this.TamanhoPilha) {

            System.out.println("Pilha Cheia Favor Esvaziar");
            return;

        }

        this.PilhaLivros[ItensPilha] = livro;
        this.ItensPilha++;

    }

    public void Pop() {

        if (this.ItensPilha == 0) {

            System.out.println("Pilha Vazia Favor Inserir Dados");
            return;

        }

        this.PilhaLivros[ItensPilha - 1] = null;
        this.ItensPilha--;

    }

    public void Peek() {

        if (this.ItensPilha == 0) {

            System.out.println("Pilha Vazia Favor Inserir Dados");
            return;

        }

         System.out.println( this.PilhaLivros[ItensPilha - 1].ShowLivro());

    }

    @Override
    public String toString() {

        if (this.ItensPilha == 0) {

            System.out.println("Pilha Vazia Favor Inserir dados");
            return null;

        }

        var Livros = "";

        for (int i = ItensPilha; i > 0; i--) {

            String str = PilhaLivros[i - 1].ShowLivro();

            Livros = Livros.concat(str);

        }

        return Livros;

    }

    public boolean IsCheia() {

        return TamanhoPilha == ItensPilha;

    }

}
