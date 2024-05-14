package br.up.edu.Model;

public class ClienteEmpresa extends Cliente{

    private String CNPJ;

    private String InscrEstadual;

    private int AnoFundacao;

    

    public ClienteEmpresa(double vlrMaximoCredito, String cNPJ, String inscrEstadual, int anoFundacao) {
        super(25000);
        CNPJ = cNPJ;
        InscrEstadual = inscrEstadual;
        AnoFundacao = anoFundacao;
    }

    public ClienteEmpresa(String nome, String telefone, String email, br.up.edu.Model.Endereco endereco,
            double vlrMaximoCredito, String cNPJ, String inscrEstadual, int anoFundacao) {
        super(nome, telefone, email, endereco, 25000);
        CNPJ = cNPJ;
        InscrEstadual = inscrEstadual;
        AnoFundacao = anoFundacao;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

    public String getInscrEstadual() {
        return InscrEstadual;
    }

    public void setInscrEstadual(String inscrEstadual) {
        InscrEstadual = inscrEstadual;
    }

    public int getAnoFundacao() {
        return AnoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        AnoFundacao = anoFundacao;
    }

    

}
