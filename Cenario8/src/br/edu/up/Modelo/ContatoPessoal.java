package br.edu.up.Modelo;
public class ContatoPessoal extends Contato {
    private String aniversario;

    public ContatoPessoal(String nome,String Telefone){

        super(nome, Telefone);

    }

    public ContatoPessoal(String nome,String Telefone,String aniversario){
       
        super(nome, Telefone);
        this.aniversario = aniversario;

    }

    public ContatoPessoal(String nome, String telefone,  int codigo, String aniversario) {
        super(codigo, nome,telefone);
        this.aniversario = aniversario;
    }

    

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Anivesario: " + aniversario;
    }



    public String getAniversario() {
        return aniversario;
    }



    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
}