package br.edu.up.modelo;

public class Reserva {

    private Cliente Clientes[];

    private Evento evento;

    private String data;

    private double valor;


    public Cliente[] getClientes() {
        return Clientes;
    }
    public void setClientes(Cliente[] clientes) {
        Clientes = clientes;
    }
    public Evento getEvento() {
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    

}
