package br.edu.up.Controller;

import br.edu.up.Modelo.AgendaContatos;
import br.edu.up.Modelo.Contato;
import br.edu.up.Modelo.ContatoPessoal;

public class AgendaController {

    private static final AgendaContatos agenda = new AgendaContatos();

    public static void IncluirContatoPessoal(Contato contato){

        agenda.adicionarContato(contato);

    }

    public static void IncluirContatoComercial(Contato contato){

        agenda.adicionarContato(contato);

    }

    public static boolean ExcluirContatoCodigo(String nome,String Telefone){

        Contato ContRm = new ContatoPessoal(nome,Telefone);

        ContRm.setCodigo(ContRm.hashCode());
        
        return agenda.removerContato(ContRm);

    }

    public static Contato ConsultarContatoCodigo(String nome,String Telefone){

        Contato ContSearch = new ContatoPessoal(nome, Telefone);

        ContSearch.setCodigo(ContSearch.hashCode());

        return agenda.buscarContato(ContSearch);

    }

    public static void ListarTodosContatos(){
        
        agenda.listarContatos();

    }

    
}
