package br.up.edu.Model;

public class SeguroVeiculo extends Seguro{

    private double VlrFranquia;

    private Boolean TemCarroReserva;

    private Boolean CobreVidros;

    public double getVlrFranquia() {
        return VlrFranquia;
    }

    public void setVlrFranquia(double vlrFranquia) {
        VlrFranquia = vlrFranquia;
    }

    public Boolean getTemCarroReserva() {
        return TemCarroReserva;
    }

    public void setTemCarroReserva(Boolean temCarroReserva) {
        TemCarroReserva = temCarroReserva;
    }

    public Boolean getCobreVidros() {
        return CobreVidros;
    }

    public void setCobreVidros(Boolean cobreVidros) {
        CobreVidros = cobreVidros;
    }

    

}
