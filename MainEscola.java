package Herança;

public class MainEscola {
    public static void main(String[] args) {

        Aluno al1 = new Aluno("Jorge", "187.993.997-50", "25/12/2000");

        System.out.println("Exibir dados do Aluno: \n" + al1.nome + " " + al1.cpf + " " + al1.dataNasc);
    }
}
