package br.edu.up.modelo;
public class Evento {

    private boolean Status = true;

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
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((local == null) ? 0 : local.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Evento other = (Evento) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (local == null) {
            if (other.local != null)
                return false;
        } else if (!local.equals(other.local))
            return false;
        return true;
    }
    public boolean isStatus() {
        return Status;
    }
    public void setStatus(boolean status) {
        Status = status;
    }

    

}
