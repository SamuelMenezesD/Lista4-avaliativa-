package br.edu.up.Modelo;

public class Aeronave {

    private String Codigo;

    private int QuantidadeAssentos;

    private String Tipo;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public int getQuantidadeAssentos() {
        return QuantidadeAssentos;
    }

    public void setQuantidadeAssentos(int quantidadeAssentos) {
        QuantidadeAssentos = quantidadeAssentos;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    

}
