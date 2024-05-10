package br.up.edu.Model;

public class Cliente {

    private String Nome;
    
    private String Telefone;

    private String Email;

    private Endereco Endereco;

    private double VlrMaximoCredito;

    private double VlrEmprestado;

    

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco endereco) {
        Endereco = endereco;
    }

    public double getVlrMaximoCredito() {
        return VlrMaximoCredito;
    }

    public void setVlrMaximoCredito(double vlrMaximoCredito) {
        VlrMaximoCredito = vlrMaximoCredito;
    }

    public double getVlrEmprestado() {
        return VlrEmprestado;
    }

    public void setVlrEmprestado(double vlrEmprestado) {
        VlrEmprestado = vlrEmprestado;
    }

    

}
