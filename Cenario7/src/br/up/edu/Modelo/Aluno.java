package br.up.edu.Modelo;

public class Aluno extends Pessoa{

    private int AnoIngressao;

    private String NomeCurso;

    private String Turno;

    public int getAnoIngressao() {
        return AnoIngressao;
    }

    public void setAnoIngressao(int anoIngressao) {
        AnoIngressao = anoIngressao;
    }

    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        NomeCurso = nomeCurso;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String turno) {
        Turno = turno;
    }

    

}
