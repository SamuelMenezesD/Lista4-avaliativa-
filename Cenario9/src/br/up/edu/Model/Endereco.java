package br.up.edu.Model;

public class Endereco {

    private String Rua;

    private String Numero;

    private String Bairro;

    private String Cep;

    private Cidade cidade;

    

    

    public Endereco(String rua, String numero, String bairro, String cep, Cidade cidade) {
        Rua = rua;
        Numero = numero;
        Bairro = bairro;
        Cep = cep;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco Rua: " + Rua + ", Numero: " + Numero + ", Bairro: " + Bairro + ", Cep: " + Cep + ", cidade: "
                + cidade + " ";
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    

}
