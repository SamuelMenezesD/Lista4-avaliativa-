package br.edu.up.modelo;
public class Evento {
    private String nome;
    private String data;
    private String local;
    private int lotacao;
    private int quantidadeingresso;
    private double valoringresso;
    private int id;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public int getLotacao() {
        return lotacao;
    }
    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }
    public int getQuantidadeingresso() {
        return quantidadeingresso;
    }
    public void setQuantidadeingresso(int quantidadeingresso) {
        this.quantidadeingresso = quantidadeingresso;
    }
    public double getValoringresso() {
        return valoringresso;
    }
    public void setValoringresso(double valoringresso) {
        this.valoringresso = valoringresso;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    

}
