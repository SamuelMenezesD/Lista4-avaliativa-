package br.edu.up.Modelo;

public class Tripulacao extends Pessoa{

    private String Matricula;

    private String IdentificacaoAeronautica;

    public String getMatricula() {
        return Matricula;
    }

    public Tripulacao(String matricula, String identificacaoAeronautica) {
        Matricula = matricula;
        IdentificacaoAeronautica = identificacaoAeronautica;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getIdentificacaoAeronautica() {
        return IdentificacaoAeronautica;
    }

    public Tripulacao() {
    }

    public void setIdentificacaoAeronautica(String identificacaoAeronautica) {
        IdentificacaoAeronautica = identificacaoAeronautica;
    }

    @Override
    public String toString() {
        return "\nTripulacao Matricula: " + Matricula + ", IdentificacaoAeronautica: " + IdentificacaoAeronautica + "\n";
    }

    


}
