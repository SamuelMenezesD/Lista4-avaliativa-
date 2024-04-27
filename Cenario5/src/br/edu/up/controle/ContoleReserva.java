package br.edu.up.controle;
import java.util.ArrayList;

import br.edu.up.modelo.Cliente;
import br.edu.up.modelo.Evento;
import br.edu.up.modelo.Reserva;

public class ContoleReserva {
    
    private static ArrayList<Reserva> reservas = new ArrayList<>();
    
    public static void Resevar(Cliente cliente, Evento evento, String data){
        
        double valor = cliente.getPessoasReservas().length * evento.getValoringresso();

        reservas.add(new Reserva(cliente, evento, data, valor, reservas.size() + 1));

    }



    public static void ExcluirReserva(int id) {


        for (Reserva reserva : reservas) {
            
            if(reserva.isStatus()){

                if(reserva.getIdreserva() == id){

                    reserva.setStatus(false);

                }
                else{

                    System.out.println("Reserva nao encontrada Favor Passar ID Valido");

                }

            }

        }

    }

    public static void ExcluirEvento(Evento evento){

            for (Reserva reserva : reservas) {
                
                if(reserva.isStatus() && reserva.getEvento().isStatus()){

                    if(reserva.getEvento().hashCode() == evento.hashCode()){

                        reserva.getEvento().setStatus(false);

                    }else{

                        System.out.println("Evento nao encontrado");

                    }

                }

            }
    }

    public static void AlterarReserva(int NumOpcao){

        switch (NumOpcao) {
            case 1:
                


                break;
            case 2:
                
                break;
            case 3:
                
                break;
        
            default:
            
            break;
        }

    }



    
}
