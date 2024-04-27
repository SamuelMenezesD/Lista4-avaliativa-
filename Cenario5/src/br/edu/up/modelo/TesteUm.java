package br.edu.up.modelo;

public class TesteUm {

    private String Nome;

    private TesteUm testeum;

    public TesteUm(String nome) {
        Nome = nome;
    }

    
    private void Criar(String nome){

        this.testeum = new TesteUm(nome);        

    }


}
