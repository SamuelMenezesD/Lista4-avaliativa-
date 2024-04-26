package br.edu.up.modelo;

public class Cliente {

    private Pessoa NomeResponsavel;
     
    private Pessoa[] PessoasReservas;
    
    
    public Cliente(Pessoa nomeResponsavel, Pessoa[] pessoasReservas) {
        NomeResponsavel = nomeResponsavel;
        PessoasReservas = pessoasReservas;
    }

    public Pessoa getNomeResponsavel() {
        return NomeResponsavel;
    }

    public void setNomeResponsavel(Pessoa nomeResponsavel) {
        NomeResponsavel = nomeResponsavel;
    }

    public Pessoa[] getPessoasReservas() {
        return PessoasReservas;
    }

    public void setPessoasReservas(Pessoa[] pessoasReservas) {
        PessoasReservas = pessoasReservas;
    }

    
    
}
