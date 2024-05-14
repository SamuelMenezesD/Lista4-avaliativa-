package Exercicio2.Apllication;

import Exercicio2.Domain.Ponto;

public class Programa {

    public static void main(String[] args) {

        Ponto ponto1 = new Ponto(1, 2);

        Ponto ponto2 = new Ponto(2, 5);

        double DistanciaPonto1Ao2 = ponto1.GetDistanciaDoisPontos(ponto2);

        System.out.println("Distancia entre o Ponto 1 Ao Ponto 2 : " + DistanciaPonto1Ao2);

        double DistanciaPonto1Cordenadas = ponto1.GetDistanciaDoisPontos(new Ponto(7, 2));

        System.out.println("Distancia entre o Ponto 1 Ao Ponto 3: " + DistanciaPonto1Cordenadas);

        ponto1.setX(10);

        ponto2.setY(3);


        

    }

}
