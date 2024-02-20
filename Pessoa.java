package Herança;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String dataNasc;

    public Pessoa (String n, String c, String d){
        this.nome = n;
        this.cpf = c;
        this.dataNasc = d;
    }

    public void exibirDados (){
        System.out.println(this.nome + " " + this.cpf + " " + this.dataNasc);
    }
}
