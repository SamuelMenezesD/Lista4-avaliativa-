package br.up.edu.Modelo;

public class Pessoa {

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
        result = prime * result + ((RG == null) ? 0 : RG.hashCode());
        result = prime * result + ((Matricula == null) ? 0 : Matricula.hashCode());
        return result;
    }


    public Pessoa(String nome, String rG, String matricula) {
        Nome = nome;
        RG = rG;
        Matricula = matricula;
    }

    public Pessoa() {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (Nome == null) {
            if (other.Nome != null)
                return false;
        } else if (!Nome.equals(other.Nome))
            return false;
        if (RG == null) {
            if (other.RG != null)
                return false;
        } else if (!RG.equals(other.RG))
            return false;
        if (Matricula == null) {
            if (other.Matricula != null)
                return false;
        } else if (!Matricula.equals(other.Matricula))
            return false;
        return true;
    }

    private String Nome;

    private String RG;
    
    private String Matricula;

    

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    

}
