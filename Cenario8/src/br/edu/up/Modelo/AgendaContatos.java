package br.edu.up.Modelo;
import java.util.ArrayList;
import java.util.List;

public class AgendaContatos {

    private List<Contato> contatos;
    
    public AgendaContatos() {

        contatos = new ArrayList<>();
       
    }

    public void adicionarContato(Contato contato) {
        
        contato.setCodigo(contato.hashCode());

        contatos.add(contato);
   
    }

    public boolean removerContato(Contato contatoRm) {
       
        for (Contato contato : contatos) {
           
            if (contato.getCodigo() == contatoRm.hashCode()) {
                
                contatos.remove(contato);
                
                return true;
            }
        }


        return false;
    }

    public Contato buscarContato(Contato contatoSearch) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == contatoSearch.getCodigo()) {
                return contato;
            }
        }
        return null;
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}