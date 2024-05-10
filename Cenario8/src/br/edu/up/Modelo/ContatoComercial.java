package Modelo;
public class ContatoComercial extends Contato {
    private String cnpj;
    
    public ContatoComercial(String nome, String telefone,  int codigo, String cnpj) {
        super(codigo, nome,telefone);
        this.cnpj = cnpj;
        
    }

    
    public String getCnpj() {
        return cnpj;
    }


    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
                "CNPJ: " + cnpj + "\n";
                
    }
}