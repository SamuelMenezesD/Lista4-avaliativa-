package br.edu.up.modelos;

public class Estacionamento {

    private Carro[] carros = new Carro[10];

    private int QuantidadeCarrosEntrada;

    private int QuantidadeCarrosSaida;

    private int QuantidadeCarrosAtual;

    private double ReceitaDiaria;

    private final int QUANTIDADE_MAXIMA_CARROS = 10;

    public void EstacionarCarro(Carro carro) {

        this.carros[QuantidadeCarrosAtual - 1] = carro;

        this.QuantidadeCarrosAtual++;
        this.QuantidadeCarrosEntrada++;

    }

    public void RetirarCarro(String placa) {

        for (Carro carro : carros) {

            if (carro.getPlaca().equalsIgnoreCase(placa)) {

                QuantidadeCarrosSaida++;
                QuantidadeCarrosAtual--;

                carro = null;

            }

        }

    }

    public double GerarReceitaTotalDia(){

        return this.QuantidadeCarrosEntrada * 5;

    }


}