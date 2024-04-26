package br.edu.up.modelo;

public class Reserva {

    private Cliente Cliente;

    private Evento evento;

    private String data;

    private double valor;

    private int idreserva;
    
    public Reserva(br.edu.up.modelo.Cliente cliente, Evento evento, String data, double valor, int idreserva) {
        Cliente = cliente;
        this.evento = evento;
        this.data = data;
        this.valor = valor;
        this.idreserva = idreserva;
    }

    public Reserva(br.edu.up.modelo.Cliente cliente, Evento evento, String data, double valor) {
        Cliente = cliente;
        this.evento = evento;
        this.data = data;
        this.valor = valor;
    }

    // public int incrementoIdevento(){
    //     for(i = 0;i >  i++){

    //     }
    //     return id;
    // }
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
    public Cliente getCliente() {
        return Cliente;
    }
    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }

    

}
