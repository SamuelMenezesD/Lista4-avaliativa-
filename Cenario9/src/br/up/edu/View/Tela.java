package br.up.edu.View;

import java.util.Scanner;

import br.up.edu.Controller.ClienteController;
import br.up.edu.Model.ClienteEmpresa;
import br.up.edu.Model.ClientePessoa;
import br.up.edu.Model.Endereco;
import br.up.edu.Model.Cidade;

public class Tela {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void exibirMenu() {
        boolean sair = false;

        while (!sair) {
            System.out.println("===== MENU =====");
            System.out.println("1. Incluir Cliente Pessoa");
            System.out.println("2. Incluir Cliente Empresa");
            System.out.println("3. Mostrar Dados Cliente Pessoa");
            System.out.println("4. Mostrar Dados Cliente Empresa");
            System.out.println("5. Emprestar Para Cliente Pessoa");
            System.out.println("6. Emprestar Para Cliente Empresa");
            System.out.println("7. Devolucao de Cliente Pessoa");
            System.out.println("8. Devolucao de Cliente Empresa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente pessoa: ");
                    String nomePessoa = scanner.next();
                    System.out.print("Digite o telefone do cliente pessoa: ");
                    String telefonePessoa = scanner.next();
                    System.out.print("Digite o email do cliente pessoa: ");
                    String emailPessoa = scanner.next();
                    System.out.print("Digite o CPF do cliente pessoa: ");
                    String cpfPessoa = scanner.next();
                    System.out.print("Digite o peso do cliente pessoa: ");
                    double pesoPessoa = scanner.nextDouble();
                    System.out.print("Digite a altura do cliente pessoa: ");
                    double alturaPessoa = scanner.nextDouble();

                    System.out.print("Digite a rua do endereço: ");
                    String ruaEndereco = scanner.next();
                    System.out.print("Digite o número do endereço: ");
                    String numeroEndereco = scanner.next();
                    System.out.print("Digite o bairro do endereço: ");
                    String bairroEndereco = scanner.next();
                    System.out.print("Digite o CEP do endereço: ");
                    String cepEndereco = scanner.next();
                    System.out.print("Digite o nome da cidade: ");
                    String nomeCidade = scanner.next();
                    System.out.print("Digite a UF da cidade: ");
                    String ufCidade = scanner.next();

                    Cidade cidade = new Cidade(nomeCidade, ufCidade);
                    Endereco endereco = new Endereco(ruaEndereco, numeroEndereco, bairroEndereco, cepEndereco, cidade);
                    ClientePessoa clientePessoa = new ClientePessoa(nomePessoa, telefonePessoa, emailPessoa, endereco, 10000, cpfPessoa, pesoPessoa, alturaPessoa);

                    ClienteController.AdicionarClientePessoa(clientePessoa);
                    System.out.println("Cliente pessoa adicionado com sucesso!");
                    break;
                
                case 2:
                    System.out.print("Digite o nome do cliente empresa: ");
                    String nomeEmpresa = scanner.next();
                    System.out.print("Digite o telefone do cliente empresa: ");
                    String telefoneEmpresa = scanner.next();
                    System.out.print("Digite o email do cliente empresa: ");
                    String emailEmpresa = scanner.next();
                    System.out.print("Digite o CNPJ do cliente empresa: ");
                    String cnpjEmpresa = scanner.next();
                    System.out.print("Digite a Inscrição Estadual do cliente empresa: ");
                    String inscEstadualEmpresa = scanner.next();
                    System.out.print("Digite o ano de fundação do cliente empresa: ");
                    int anoFundacaoEmpresa = scanner.nextInt();

                    System.out.print("Digite a rua do endereço: ");
                    String ruaEnderecoEmpresa = scanner.next();
                    System.out.print("Digite o número do endereço: ");
                    String numeroEnderecoEmpresa = scanner.next();
                    System.out.print("Digite o bairro do endereço: ");
                    String bairroEnderecoEmpresa = scanner.next();
                    System.out.print("Digite o CEP do endereço: ");
                    String cepEnderecoEmpresa = scanner.next();
                    System.out.print("Digite o nome da cidade: ");
                    String nomeCidadeEmpresa = scanner.next();
                    System.out.print("Digite a UF da cidade: ");
                    String ufCidadeEmpresa = scanner.next();

                    Cidade cidadeEmpresa = new Cidade(nomeCidadeEmpresa, ufCidadeEmpresa);
                    Endereco enderecoEmpresa = new Endereco(ruaEnderecoEmpresa, numeroEnderecoEmpresa, bairroEnderecoEmpresa, cepEnderecoEmpresa, cidadeEmpresa);
                    ClienteEmpresa clienteEmpresa = new ClienteEmpresa(nomeEmpresa, telefoneEmpresa, emailEmpresa, enderecoEmpresa, 25000, cnpjEmpresa, inscEstadualEmpresa, anoFundacaoEmpresa);

                    ClienteController.AdicionarClientesEmpresa(clienteEmpresa);
                    System.out.println("Cliente empresa adicionado com sucesso!");
                    break;

                case 3:
                    ClienteController.ListarClientesPessoa();
                    break;

                case 4:
                    ClienteController.ListarClientesEmpresa();
                    break;

                case 5:
                    System.out.print("Digite o valor do empréstimo: ");
                    double valorEmprestimoPessoa = scanner.nextDouble();
                    System.out.print("Digite o CPF do cliente pessoa: ");
                    String cpfEmprestimoPessoa = scanner.next();

                    ClienteController.EmprestarClientePessoa(valorEmprestimoPessoa, cpfEmprestimoPessoa);
                    System.out.println("Empréstimo realizado com sucesso!");
                    break;

                case 6:
                    System.out.print("Digite o valor do empréstimo: ");
                    double valorEmprestimoEmpresa = scanner.nextDouble();
                    System.out.print("Digite o CNPJ do cliente empresa: ");
                    String cnpjEmprestimoEmpresa = scanner.next();

                    ClienteController.EmprestarClienteEmpresa(valorEmprestimoEmpresa, cnpjEmprestimoEmpresa);
                    System.out.println("Empréstimo realizado com sucesso!");
                    break;

                case 7:
                    System.out.print("Digite o valor da devolução: ");
                    double valorDevolucaoPessoa = scanner.nextDouble();
                    System.out.print("Digite o CPF do cliente pessoa: ");
                    String cpfDevolucaoPessoa = scanner.next();

                    ClienteController.DevolucaoClientePessoa(valorDevolucaoPessoa, cpfDevolucaoPessoa);
                    System.out.println("Devolução realizada com sucesso!");
                    break;

                case 8:
                    System.out.print("Digite o valor da devolução: ");
                    double valorDevolucaoEmpresa = scanner.nextDouble();
                    System.out.print("Digite o CNPJ do cliente empresa: ");
                    String cnpjDevolucaoEmpresa = scanner.next();

                    ClienteController.DevolucaoClienteEmpresa(valorDevolucaoEmpresa, cnpjDevolucaoEmpresa);
                    System.out.println("Devolução realizada com sucesso!");
                    break;

                case 0:
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    public static void main(String[] args) {
        exibirMenu();
    }
}