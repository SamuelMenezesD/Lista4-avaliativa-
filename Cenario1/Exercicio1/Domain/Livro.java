package Exercicio1.Domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Livro {

    private  final Scanner scanner = new Scanner(System.in);

    private String codigo;

    private String Titulo;

    private String[] Autores = new String[100];

    private int Ano;

    private String ISBN;

    

    public Livro() {
    }

    public String ShowLivro() {

       var Text =  String.format("\nCodigo: %s Ano: %d ISBN: %s Titulo: %s Autores: %s",
                this.codigo,
                this.Ano,
                this.ISBN,
                this.Titulo,
                Arrays.toString(Autores));

        return Text;
    }

    public Livro(String codigo, String titulo, String[] autores, int ano, String iSBN) {
        this.codigo = codigo;
        Titulo = titulo;
        Autores = autores;
        Ano = ano;
        ISBN = iSBN;
    }

    public  Livro CriarLivro(){

        System.out.println("Informe o Nome do livro: ");
        var nome = scanner.nextLine();

        System.out.println("Informe o codigo do livro: ");
        var codigo = scanner.nextLine();

        System.out.println("Informe o ano do livro: ");
        var ano = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Informe o ISBN do livro: ");
        var ISBN = scanner.nextLine();

        SetarAutores();

        return new Livro(codigo, nome, Autores, ano, ISBN);


    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String[] getAutores() {
        return Autores;
    }

    public void setAutores(String[] autores) {
        Autores = autores;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    private  void SetarAutores(){

        int position = 0;
        int option;   
        
            do{

            System.out.println("Informe o nome do Autor: ");
            this.Autores[position] = scanner.nextLine();
         
            System.out.printf("Deseja inserir mais um autor: (1) Sim (0) Nao");
            option = scanner.nextInt();

            scanner.nextLine();

            position++;

        }while(option != 0);


    }

}
