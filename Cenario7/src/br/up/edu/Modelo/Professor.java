package br.up.edu.Modelo;

public class Professor extends Pessoa{

    private String IdentCurriculoLattes;

    private Titulacao titulacao;

    public String getIdentCurriculoLattes() {
        return IdentCurriculoLattes;
    }

    public void setIdentCurriculoLattes(String identCurriculoLattes) {
        IdentCurriculoLattes = identCurriculoLattes;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    

}
