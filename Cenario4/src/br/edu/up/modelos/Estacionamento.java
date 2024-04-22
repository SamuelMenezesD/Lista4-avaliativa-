package br.edu.up.modelos;

public class Estacionamento {
    
    private Carro[] carros = new Carro[10];

    private int QuantidadeCarrosEntrada;

    private int QuantidadeCarrosSaida;

    private int QuantidadeCarrosAtual;

    private final int QUANTIDADE_MAXIMA_CARROS = 10;

    public void EstacionarCarro(Carro carro) {

        this.carros[QuantidadeCarrosAtual - 1] = carro;

        this.QuantidadeCarrosAtual++;
        this.QuantidadeCarrosEntrada++;

    }

    public Carro RetirarCarro(String placa) {

        for (Carro carro : carros) {

            if (carro.getPlaca().equalsIgnoreCase(placa)) {

                QuantidadeCarrosSaida++;
                QuantidadeCarrosAtual--;

                return carro;

            }

        }

        return null;

    }

    public Carro[] getCarros() {
        return this.carros;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }

    public int getQUANTIDADE_MAXIMA_CARROS() {
        return QUANTIDADE_MAXIMA_CARROS;
    }

}