package Modelo;
import java.util.ArrayList;
import java.util.List;

public class AgendaContatos {

    private List<Contato> contatos;
    private int proximoCodigo;

    public AgendaContatos() {
        contatos = new ArrayList<>();
        proximoCodigo = 1;
    }

    public void adicionarContato(Contato contato) {
        contato.setCodigo(proximoCodigo);
        contatos.add(contato);
        proximoCodigo++;
    }

    public boolean removerContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                contatos.remove(contato);
                return true;
            }
        }
        return false;
    }

    public Contato buscarContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
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