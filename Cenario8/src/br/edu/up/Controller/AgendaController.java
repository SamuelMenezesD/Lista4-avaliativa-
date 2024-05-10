package br.edu.up.Controller;

import br.edu.up.Modelo.AgendaContatos;
import br.edu.up.Modelo.Contato;

public class AgendaController {

    private static final AgendaContatos agenda = new AgendaContatos();

    public static void IncluirContatoPessoal(Contato contato){

        agenda.adicionarContato(contato);

    }

    public static void IncluirContatoComercial(Contato contato){

        agenda.adicionarContato(contato);

    }

    public static boolean ExcluirContatoCodigo(int codigo){

        return agenda.removerContato(codigo);

    }

    public static Contato ConsultarContatoCodigo(int codigo){

        return agenda.buscarContato(codigo);

    }

    public static void ListarTodosContatos(){
        
        agenda.listarContatos();

    }

    
}
