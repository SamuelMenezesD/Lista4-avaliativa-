package br.up.edu.Modelo;

public class Disciplina {

    private String competencia;

    private String Nome;

    public Disciplina(String competencia, String nome, String curriculo) {
        this.competencia = competencia;
        Nome = nome;
        Curriculo = curriculo;
    }

    private int Id;

    private String Curriculo;

    private Aluno[] alunos = new Aluno[35];

    private Professor[] professores = new Professor[5];
    
    public Disciplina(String competencia, String nome, int id, String curriculo, Aluno[] alunos,
            Professor[] professores) {
        this.competencia = competencia;
        Nome = nome;
        Id = id;
        Curriculo = curriculo;
        this.alunos = alunos;
        this.professores = professores;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public Disciplina() {
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

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }
}
