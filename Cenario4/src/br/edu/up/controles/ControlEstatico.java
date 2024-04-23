package br.edu.up.controles;

import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Estacionamento;

public class ControlEstatico {

    private static Estacionamento estacionamento = new Estacionamento();

    public static void estacionaCarro(Carro carro) {

        estacionamento.EstacionarCarro(carro);
    }

    public static void RetirarCarro(String placa) {

        estacionamento.RetirarCarro(placa);
        
    }

    public static void GerarRelatorio(){
    
        //Arrumar Parte estacionamento 
        String.format("Quantidade de Carros no dia: %d",this.QuantidadeCarrosEntrada);

        String.format("Quantidade de receita gerada no dia : %f.2",this.receita);

        String.format("Quantidade de Carros estacionados : %d",this.QuantidadeCarrosAtual);

        String.format("Quantidade de Carros que sairam : %d",this.QuantidadeCarrosSaida);



    }

}
