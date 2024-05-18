package br.up.edu.Modelo;

import java.util.Scanner;

public class Aluno extends Pessoa{

    private Boolean IsMateriaCompleta;

    private int AnoIngressao;

    public Aluno(int anoIngressao, String nomeCurso, String turno) {
        AnoIngressao = anoIngressao;
        NomeCurso = nomeCurso;
        Turno = turno;
    }

    public Aluno(String nome, String rG, String matricula) {
        super(nome, rG, matricula);
    }

    public void VerificarSituacaoMateria(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a nota do primeiro Tri:");
        var nota = scanner.nextDouble();

        System.out.println("Informe a nota do segundo Tri:");
        var nota2 = scanner.nextDouble();

        System.out.println("Informe a nota do terceiro Tri:");
        var nota3 = scanner.nextDouble();

        var notatotal = (nota + nota2 + nota3) / 3;

        if(notatotal >= 60){

            this.IsMateriaCompleta = true;

        }
        else{

            this.IsMateriaCompleta = false;

        }

    }

    public Boolean getIsMateriaCompleta() {
        return IsMateriaCompleta;
    }

    public void setIsMateriaCompleta(Boolean isMateriaCompleta) {
        IsMateriaCompleta = isMateriaCompleta;
    }

    public Aluno(String nome, String rG, String matricula, int anoIngressao, String nomeCurso, String turno) {
        super(nome, rG, matricula);
        AnoIngressao = anoIngressao;
        NomeCurso = nomeCurso;
        Turno = turno;
    }

  
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
