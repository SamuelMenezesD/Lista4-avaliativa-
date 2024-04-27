package br.edu.up.controle;
import java.util.ArrayList;

import br.edu.up.modelo.Cliente;
import br.edu.up.modelo.Evento;
import br.edu.up.modelo.Pessoa;
import br.edu.up.modelo.Reserva;

public class ContoleReserva {
    
    private static Reserva[] reservas = new Reserva[100];

    private static int quantReservas = 0;
    
    public static void Resevar(Cliente cliente, Evento evento, String data){
        
        double valor = cliente.getPessoasReservas().length * evento.getValoringresso();

        Reserva reserva = new Reserva(cliente, evento, data, valor,quantReservas);

        reservas[quantReservas] = reserva;

        quantReservas++;

    }



    public static void ExcluirReserva(int id) {


        for (Reserva reserva : reservas) {
            
            if(reserva.isStatus()){

                if(reserva.getIdreserva() == id){

                    reserva.setStatus(false);
                    return;

                }

            }

        }

        System.out.println("Reserva nao encontrada");
            
    }

    public static void ExcluirEvento(Evento evento){

            for (Reserva reserva : reservas) {
                
                if(reserva.isStatus() && reserva.getEvento().isStatus()){

                    if(reserva.getEvento().hashCode() == evento.hashCode()){

                        reserva.getEvento().setStatus(false);
                        return;

                    }
                }
            }

            System.out.println("Reserva nao encontrada ");
    }

    public static void AlterarNomeReserva(int id, String nome){

        for (Reserva reserva : reservas) {
            
            if(reserva.isStatus()){

                if(reserva.getIdreserva() == id){

                    reserva.getCliente().getNomeResponsavel().setNome(nome);;
                    return;
                }

            }

        }

        System.out.println("Reserva nao encontrada");
    
    }

    public static void AlterarPessoasReserva(int id,Pessoa[] pessoas){

        for (Reserva reserva : reservas) {
            
            if(reserva.isStatus()){

                if(reserva.getIdreserva() == id){

                    reserva.getCliente().setPessoasReservas(pessoas);
                    return;
                }

            }

        }

        System.out.println("Reserva nao encontrada");

    }

    public static void AlterarDataReserva(String data,int id){

        for (Reserva reserva : reservas) {
            
            if(reserva.isStatus()){

                if(reserva.getIdreserva() == id){

                    reserva.setData(data);
                    return;
                }

            }

        }

        System.out.println("Reserva nao encontrada");

    }


}
