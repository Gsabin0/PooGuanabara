package Aula8;
public class AppPessoa {
    public static void main(String[] args) {
       Pessoa p1=new Pessoa();
       Aluno p2 =  new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p2.setNome("João");
       p2.setIdade(18);
       p2.setSexo("M");
       p2.fazniver();
       p2.canmatri();
       p2.detalhes();
    }
    
}
