package Herança;

public class Professor extends Pessoa{
    public Professor (String nome, String cpf, String dataNasc) {
        super(nome, cpf, dataNasc);
    }

    public String salario;
    public String disciplina;
    
}
