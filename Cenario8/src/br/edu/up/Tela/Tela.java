package br.edu.up.Tela;

import java.util.Scanner;

import Modelo.AgendaContatos;
import Modelo.Contato;
import Modelo.ContatoComercial;
import Modelo.ContatoPessoal;

public class Tela {
    private static Scanner scanner;
    private static AgendaContatos agenda;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        agenda = new AgendaContatos();

        exibirMenu();
    }

    public static void exibirMenu() {
        boolean sair = false;

        while (!sair) {
            System.out.println("===== MENU =====");
            System.out.println("1. Incluir um contato pessoal");
            System.out.println("2. Incluir um contato comercial");
            System.out.println("3. Excluir um contato pelo código");
            System.out.println("4. Consultar um contato pelo código");
            System.out.println("5. Listar todos os contatos");
            System.out.println("6. Sair do programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    incluirContatoPessoal();
                    break;
                case 2:
                    incluirContatoComercial();
                    break;
                case 3:
                    excluirContato();
                    break;
                case 4:
                    consultarContato();
                    break;
                case 5:
                    listarContatos();
                    break;
                case 6:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void incluirContatoPessoal() {
        System.out.println("===== Incluir Contato Pessoal =====");
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Telefone: ");
        String telefone = scanner.next();
        System.out.print("Codigo: ");
        int codigo = scanner.nextInt();
        System.out.print("Aniversario: ");
        String aniversario = scanner.next();

        ContatoPessoal contatoPessoal = new ContatoPessoal( nome,telefone, codigo,aniversario);
        agenda.adicionarContato(contatoPessoal);

        System.out.println("Contato pessoal adicionado com sucesso!");
        System.out.println();
    }

    public static void incluirContatoComercial() {
        System.out.println("===== Incluir Contato Comercial =====");
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Telefone: ");
        String telefone = scanner.next();
        System.out.print("Codigo: ");
        int codigo = scanner.nextInt();
        System.out.print("CNPJ: ");
        String cnpj = scanner.next();

        ContatoComercial contatoComercial = new ContatoComercial(nome, telefone, codigo, cnpj);
        agenda.adicionarContato(contatoComercial);

        System.out.println("Contato comercial adicionado com sucesso!");
        System.out.println();
    }

    public static void excluirContato() {
        System.out.println("===== Excluir Contato =====");
        System.out.print("Código do contato: ");
        int codigo = scanner.nextInt();

        boolean contatoRemovido = agenda.removerContato(codigo);

        if (contatoRemovido) {
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }

        System.out.println();
    }

    public static void consultarContato() {
        System.out.println("===== Consultar Contato =====");
        System.out.print("Código do contato: ");
        int codigo = scanner.nextInt();

        Contato contato = agenda.buscarContato(codigo);

        if (contato != null) {
            System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado.");
        }

        System.out.println();
    }

    public static void listarContatos() {
        System.out.println("===== Lista de Contatos =====");
        agenda.listarContatos();
        System.out.println();
    }
    
}
