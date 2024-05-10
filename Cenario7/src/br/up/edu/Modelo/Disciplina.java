package br.up.edu.Modelo;

public class Disciplina {

    private String Nome;

    private int Id;

    private String Curriculo;

    private Aluno[] alunos = new Aluno[35];

    private Professor[] professores = new Professor[5];

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCurriculo() {
        return Curriculo;
    }

    public void setCurriculo(String curriculo) {
        Curriculo = curriculo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
