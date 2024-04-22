package br.edu.up.controles;

import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Estacionamento;

public class ControlEstatico {

    private static Estacionamento estacionamento = new Estacionamento();

    public static void estacionaCarro(Carro carro){

        estacionamento.EstacionarCarro(carro);
    }
    

}
