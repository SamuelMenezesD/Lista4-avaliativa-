package br.up.edu.Controller;

import java.util.ArrayList;
import java.util.List;

import br.up.edu.Model.ClienteEmpresa;
import br.up.edu.Model.ClientePessoa;

public class ClienteController {

    private static List<ClienteEmpresa> ClientesEmpresa = new ArrayList<>();

    private static List<ClientePessoa> ClientesPessoa = new ArrayList<>();

    public static void AdicionarClientePessoa(ClientePessoa cliente){

        ClientesPessoa.add(cliente);

    }

    public static void AdicionarClientesEmpresa(ClienteEmpresa cliente){

        ClientesEmpresa.add(cliente);

    }

    public static void ListarClientesPessoa(){

        for (ClientePessoa clientePessoa : ClientesPessoa) {
            
            System.out.println(clientePessoa);

        }

    }


    public static void ListarClientesEmpresa(){

        for (ClienteEmpresa clienteEmpresa : ClientesEmpresa) {
            
            System.out.println(clienteEmpresa);

        }

    }

    public static void EmprestarClientePessoa(double Valor,String CpfReferente){

        for (ClientePessoa pessoa : ClientesPessoa) {
            
            if(pessoa.getCPF().equalsIgnoreCase(CpfReferente)){

                pessoa.Emprestar(Valor);

            }

        }

    }

    public static void EmprestarClienteEmpresa(double valor,String Cnpj){

        for (ClienteEmpresa clienteEmpresa : ClientesEmpresa) {

            if(clienteEmpresa.getCNPJ().equalsIgnoreCase(Cnpj)){

                clienteEmpresa.Emprestar(valor);

            }

        }

    }

    public static void DevolucaoClientePessoa(double ValorDevolucao,String CpfReferente){

        for (ClientePessoa pessoa : ClientesPessoa) {
            
            if(pessoa.getCPF().equalsIgnoreCase(CpfReferente)){

                pessoa.Devolver(ValorDevolucao);

            }

        }
        

    }

    public static void DevolucaoClienteEmpresa(double ValorDevolucao,String Cnpj){

        for (ClienteEmpresa clienteEmpresa : ClientesEmpresa) {

            if(clienteEmpresa.getCNPJ().equalsIgnoreCase(Cnpj)){

                clienteEmpresa.Emprestar(ValorDevolucao);

            }

        }

    }



}
