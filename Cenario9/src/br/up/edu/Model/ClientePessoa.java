package br.up.edu.Model;

public class ClientePessoa extends Cliente{

    private String CPF;
    
    private double Peso;

    private double Altura;

        

    public ClientePessoa(String cPF, double peso, double altura) {
        CPF = cPF;
        Peso = peso;
        Altura = altura;
    }

    public ClientePessoa(double vlrMaximoCredito, String cPF, double peso, double altura) {
        super(10000);
        CPF = cPF;
        Peso = peso;
        Altura = altura;
    }

    public ClientePessoa(String nome, String telefone, String email, br.up.edu.Model.Endereco endereco,
            double ValorMaximo, String cPF, double peso, double altura) {
        super(nome, telefone, email, endereco, 10.000);
        CPF = cPF;
        Peso = peso;
        Altura = altura;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    

}
