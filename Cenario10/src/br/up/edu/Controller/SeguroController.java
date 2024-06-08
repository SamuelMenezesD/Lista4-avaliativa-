package br.up.edu.Controller;

import java.lang.ModuleLayer.Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.up.edu.Model.Seguro;
import br.up.edu.Model.SeguroVeiculo;
import br.up.edu.Model.SeguroVida;
import br.up.edu.View.View;

public class SeguroController {
    private List<Seguro> seguros = new ArrayList<>();

    private Scanner scanner;

    public void incluirSeguro() {
            System.out.println("Digite o número da apólice: ");
            String numeroApolice = scanner.nextLine();
        
            boolean numeroApoliceExistente = seguros.stream()
                    .anyMatch(Seguro -> Seguro.getApolice() == numeroApolice);
        
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
        }
    

        public void localizarSeguro() {
            System.out.println("Digite o número da apólice que deseja localizar: ");
            String numeroApolice = scanner.nextLine();
        
            boolean numeroApoliceExistente = false;
            Seguro seguroEncontrado = null;
        
            for (Seguro seguro : seguros) {
                if (seguro.getApolice() == numeroApolice) {
                    numeroApoliceExistente = true;
                    seguroEncontrado = seguro;
                    break;
                }
            }
        
            if (numeroApoliceExistente) {
                // Lógica para exibir os detalhes do seguro encontrado
                System.out.println("Seguro encontrado!");
                System.out.println("Número da apólice: " + seguroEncontrado.getApolice());
                System.out.println("Valor do seguro: " + seguroEncontrado.getVlrApolice());
        
                if (seguroEncontrado instanceof SeguroVida) {
                    SeguroVida seguroVida = (SeguroVida) seguroEncontrado;
                    System.out.println("Tipo de seguro: Seguro de Vida");
                } else if (seguroEncontrado instanceof SeguroVeiculo) {
                    SeguroVeiculo seguroVeiculo = (SeguroVeiculo) seguroEncontrado;
                    System.out.println("Tipo de seguro: Seguro de Veículo");
    
                }
            } else {
                System.out.println("Seguro não encontrado.");
            }
        }

        public void excluirSeguro() {
            System.out.println("Digite o número da apólice que deseja excluir: ");
            String numeroApolice = scanner.nextLine();
        
            boolean numeroApoliceExistente = false;
            Seguro seguroEncontrado = null;
        
            for (Seguro seguro : seguros) {
                if (seguro.getApolice() == numeroApolice) {
                    numeroApoliceExistente = true;
                    seguroEncontrado = seguro;
                    break;
                }
            }
        
            if (numeroApoliceExistente) {
                // Remover o seguro da lista
                seguros.remove(seguroEncontrado);
                System.out.println("Seguro removido com sucesso!");
            } else {
                System.out.println("Seguro não encontrado.");
            }
        }

        public void excluirTodosSeguros() {
            seguros.clear();
            System.out.println("Todos os seguros foram removidos com sucesso!");
        }

        public void listarTodosSeguros() {
            if (seguros.isEmpty()) {
                System.out.println("Não há seguros cadastrados.");
            } else {
                System.out.println("Lista de todos os seguros:");
        
                for (Seguro seguro : seguros) {
                    System.out.println("Número da apólice: " + seguro.getApolice());
                    System.out.println("Valor do seguro: " + seguro.getVlrApolice());
        
                    if (seguro instanceof SeguroVida) {
                        SeguroVida seguroVida = (SeguroVida) seguro;
                        System.out.println("Tipo de seguro: Seguro de Vida");
                     
                    } else if (seguro instanceof SeguroVeiculo) {
                        SeguroVeiculo seguroVeiculo = (SeguroVeiculo) seguro;
                        System.out.println("Tipo de seguro: Seguro de Veículo");
                
                    }
        
                    System.out.println("---------------------");
                }
            }
        }

        public void quantidadeSeguros() {
            int quantidade = seguros.size();
            System.out.println("A quantidade de seguros cadastrados é: " + quantidade);
        }

    public void run() {
        View view = new View(this);
        view.displayMenu();
    }

    public static void main(String[] args) {
        SeguroController controller = new SeguroController();
        controller.run();
    }

    
}
