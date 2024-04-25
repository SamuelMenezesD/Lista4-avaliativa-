package br.edu.up.modelos;

public class Estacionamento {

    private Carro[] carros = new Carro[10];

    private int QuantidadeCarrosEntrada;

    private int QuantidadeCarrosSaida;

    private int QuantidadeCarrosAtual = 0;

    private double ReceitaDiaria;

    public double getReceitaDiaria() {
        return ReceitaDiaria;
    }

    public void setReceitaDiaria(double receitaDiaria) {
        ReceitaDiaria = receitaDiaria;
    }

    private final int QUANTIDADE_MAXIMA_CARROS = 10;

    public void EstacionarCarro(Carro carro) {


        if(this.QuantidadeCarrosAtual < QUANTIDADE_MAXIMA_CARROS){
        this.carros[QuantidadeCarrosAtual] = carro;

        this.QuantidadeCarrosAtual++;
        this.QuantidadeCarrosEntrada++;
    }
    else{

        System.out.println("Estacionamento cheio");

    }

    }

    public void GerarReceita(){

        double receitaDiaria = this.QuantidadeCarrosEntrada * 5.0;

        System.out.println(String.format("Receita do dia: %.2f Entrada de Carros: %d Saida de Carros: %d", 
        receitaDiaria,this.QuantidadeCarrosEntrada,this.QuantidadeCarrosSaida));

    }

    public void RetirarCarro(String placa) {

        if(this.QuantidadeCarrosAtual >= 1){
        for (Carro carro : carros) {

            if (carro.getPlaca().equalsIgnoreCase(placa)) {

                QuantidadeCarrosSaida++;
                QuantidadeCarrosAtual--;

                carro = null;

            }

        }

        System.out.println("Carro retirado!");
    }
    else{System.out.println("Quantidade de carros invalida para retirada");}
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