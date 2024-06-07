package br.up.edu.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.up.edu.Model.Seguro;
import br.up.edu.Model.SeguroVeiculo;
import br.up.edu.Model.SeguroVida;

public class SeguroController {
    private List<Seguro> seguros = new ArrayList<>();

    public void incluirSeguro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da apólice: ");
        String numeroApolice = scanner.nextLine();

        boolean numeroApoliceExistente = seguros.stream()
                .anyMatch(seguro -> seguro.getApolice() == numeroApolice);

        if (numeroApoliceExistente) {
            System.out.println("Número de apólice já existente. Não é possível adicionar o seguro.");
        } else {
            System.out.println("Digite o valor do seguro: ");
            double valor = scanner.nextDouble();

            System.out.println("Digite 1 para seguro de vida ou 2 para seguro de veículo: ");
            int tipoSeguro = scanner.nextInt();

            if (tipoSeguro == 1) {
                SeguroVida seguroVida = new SeguroVida();
                seguroVida.setApolice(numeroApolice);
                seguroVida.setVlrApolice(tipoSeguro);
                seguros.add(seguroVida);
            } else if (tipoSeguro == 2) {
                SeguroVeiculo seguroVeiculo = new SeguroVeiculo();
                seguroVeiculo.setApolice(numeroApolice);
                seguroVeiculo.setVlrApolice(tipoSeguro);
                seguros.add(seguroVeiculo);
            } else {
                System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }

    
}
