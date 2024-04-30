package br.edu.up.Modelo;

public class Passagem {

    private String DataVoo;

    private int NumeroAssento;

    private String ClasseAssento;

    public Passagem(int NumeroAssento, String ClasseAssento, String DataVoo) {
        this.NumeroAssento = NumeroAssento;
        this.ClasseAssento = ClasseAssento;
        this.DataVoo = DataVoo;
    }

    public String getDataVoo() {
        return DataVoo;
    }

    public void setDataVoo(String dataVoo) {
        DataVoo = dataVoo;
    }

    public int getNumeroAssento() {
        return NumeroAssento;
    }

    public void setNumeroAessnto(int numeroAessnto) {
        NumeroAssento = numeroAessnto;
    }

    public String getClasseAssento() {
        return ClasseAssento;
    }

    public void setClasseAssento(String classeAssento) {
        ClasseAssento = classeAssento;
    }

  

}
