package br.edu.up.controle;
import java.util.ArrayList;

import br.edu.up.modelo.Cliente;
import br.edu.up.modelo.Evento;
import br.edu.up.modelo.Reserva;

public class ContoleEvento {
    
    private static ArrayList<Reserva> reservas = new ArrayList<>();
    
    public static void Resevar(Cliente cliente, Evento evento, String data){
        
        double valor = cliente.getPessoasReservas().length * evento.getValoringresso();

        reservas.add(new Reserva(cliente, evento, data, valor, reservas.size()+1));

    }
    public static void ExcluirReserva(int id) {

        


    }
    
}
