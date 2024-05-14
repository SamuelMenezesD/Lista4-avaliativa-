package br.up.edu.Model;

public abstract class Cliente {

    private String Nome;
    
    private String Telefone;

    private String Email;

    private Endereco Endereco;

    private double VlrMaximoCredito;

    private double VlrEmprestado;

    

    @Override
    public String toString() {
        return "Cliente Nome: " + Nome + ", Telefone: " + Telefone + ", Email: " + Email + ", Endereco: " + Endereco
                + ", VlrMaximoCredito: " + VlrMaximoCredito + ", VlrEmprestado: " + VlrEmprestado + " ";
    }

    public Cliente() {
    }

    public Cliente(double vlrMaximoCredito) {
        VlrMaximoCredito = vlrMaximoCredito;
    }

    public Cliente(String nome, String telefone, String email, br.up.edu.Model.Endereco endereco,
            double vlrMaximoCredito) {
        Nome = nome;
        Telefone = telefone;
        Email = email;
        Endereco = endereco;
        VlrMaximoCredito = vlrMaximoCredito;
    }

    public void Emprestar(double Valor){

        if(Valor > this.VlrMaximoCredito || Valor > (this.VlrMaximoCredito - VlrEmprestado)){
        
            System.out.println("Impossivel de se realizar Emprestimo");
    
    }

    this.VlrEmprestado += Valor;
    
}

    public void Devolver(double Valor){

        this.VlrEmprestado -= Valor;

    }

    public double GetSaldo(){

        return (this.VlrMaximoCredito - this.VlrEmprestado);
        
    }

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
