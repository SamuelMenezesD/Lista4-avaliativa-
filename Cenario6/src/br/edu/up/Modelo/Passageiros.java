package br.edu.up.Modelo;

public class Passageiros extends Pessoa{

    private String IdentificadorBagagem;

    private Passagem passagem;

    public String getIdentificadorBagagem() {
        return IdentificadorBagagem;
    }

    public void setIdentificadorBagagem(String identificadorBagagem) {
        IdentificadorBagagem = identificadorBagagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    

}
