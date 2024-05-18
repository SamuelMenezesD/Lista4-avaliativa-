package br.up.edu.Modelo;

import java.util.Scanner;

public class Titulacao {

    private String NomeInstituicao;

    private String NomeTitulo;

    private int AnoConclusao;

    private String TituloTrabalhoConclusao;

    public static Titulacao GerarTitulacao(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o Nome da Instituicao: ");
        var Instituicao = scanner.nextLine();

        System.out.println("Informe o Nome do Titulo: ");
        var Titulo = scanner.nextLine();

        System.out.println("Informe o ano de conclusao: ");
        var Ano = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Informe o Titulo do TCC: ");
        var TCC = scanner.nextLine();

        return new Titulacao(Instituicao, Titulo, Ano, TCC);

    }
    

    public Titulacao(String nomeInstituicao, String nomeTitulo, int anoConclusao, String tituloTrabalhoConclusao) {
        NomeInstituicao = nomeInstituicao;
        NomeTitulo = nomeTitulo;
        AnoConclusao = anoConclusao;
        TituloTrabalhoConclusao = tituloTrabalhoConclusao;
    }


    public String getNomeInstituicao() {
        return NomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        NomeInstituicao = nomeInstituicao;
    }

    public String getNomeTitulo() {
        return NomeTitulo;
    }

    public void setNomeTitulo(String nomeTitulo) {
        NomeTitulo = nomeTitulo;
    }

    public int getAnoConclusao() {
        return AnoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        AnoConclusao = anoConclusao;
    }

    public String getTituloTrabalhoConclusao() {
        return TituloTrabalhoConclusao;
    }

    public void setTituloTrabalhoConclusao(String tituloTrabalhoConclusao) {
        TituloTrabalhoConclusao = tituloTrabalhoConclusao;
    }

    

}
