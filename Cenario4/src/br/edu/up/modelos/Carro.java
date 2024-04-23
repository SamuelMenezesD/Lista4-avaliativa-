package br.edu.up.modelos;

public class Carro {
    private String placa;
    private String modelo;
    private String cor;
    private int Entrada;
    private int Saida;

    public double GerarReceita() {

        double valor = 0;

        if (Saida - Entrada == 0) {

            valor = 5.0;

        } else if (Saida - Entrada == 1) {

            valor = 10.0;

        } else if (Saida - Entrada == 2) {

            valor = 15.0;

        }

        return valor;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getEntrada() {
        return Entrada;
    }

    public void setEntrada(int entrada) {
        Entrada = entrada;
    }

    public int getSaida() {
        return Saida;
    }

    public void setSaida(int saida) {
        Saida = saida;
    }

}
