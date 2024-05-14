package br.up.edu.Model;

import java.time.LocalDateTime;

public abstract class Seguro {

    private String Apolice;

    private Segurado Segurado;

    private double VlrApolice;

    private LocalDateTime DtaInicio;

    private LocalDateTime DtaFim;

    
    public String GetDados() {
        return "Seguro Apolice: " + Apolice + ", Segurado: " + Segurado + ", VlrApolice: " + VlrApolice + ", DtaInicio: "
                + DtaInicio + ", DtaFim: " + DtaFim + " ";
    }

    public String getApolice() {
        return Apolice;
    }

    public void setApolice(String apolice) {
        Apolice = apolice;
    }

    public Segurado getSegurado() {
        return Segurado;
    }

    public void setSegurado(Segurado segurado) {
        Segurado = segurado;
    }

    public double getVlrApolice() {
        return VlrApolice;
    }

    public void setVlrApolice(double vlrApolice) {
        VlrApolice = vlrApolice;
    }

    public LocalDateTime getDtaInicio() {
        return DtaInicio;
    }

    public void setDtaInicio(LocalDateTime dtaInicio) {
        DtaInicio = dtaInicio;
    }

    public LocalDateTime getDtaFim() {
        return DtaFim;
    }

    public void setDtaFim(LocalDateTime dtaFim) {
        DtaFim = dtaFim;
    }

    

}
