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

        System.out.println(String.format("Receita do dia: %.2f Entrada de Carros: %d Saida de Carros: %d", 
        
        estacionamento.getReceitaDiaria(),estacionamento.getQuantidadeCarrosEntrada(),estacionamento.getQuantidadeCarrosSaida()));

    }

}
