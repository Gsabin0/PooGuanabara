package Aula9;
public class Apppessoa {
    public static void main(String[] args) {
        Aluno l1 = new Aluno();
        l1.setNome("Sabis");
        l1.setIdade(23);
        l1.setSexo("M");
        l1.setMatri(12222);
        l1.setCurso("ADS");
        l1.pagarmen();
        l1.fazermiver();
        
        Visitante l2 = new Visitante();
        l2.setNome("Sara");
        l2.setIdade(21);
        l2.setSexo("F");
        l2.fazermiver();
        
        Professor l3 = new Professor();
        l3.setNome("João");
        l3.setIdade(53);
        l3.setSexo("M");
        l3.fazermiver();
        l3.setEspecialista("Matematica");
        l3.setSalario(3000f);
        l3.receberaumen(400.5f);
        
        Bolsista l4 = new Bolsista();
        l4.setNome("Helio");
        l4.setIdade(22);
        l4.setSexo("M");
        l4.setMatri(1332);
        l4.setCurso("ADS");
        l4.setBolsa(2000f);
        l4.pagarmen();
        
        
        
        l1.detalhes();
        l1.especifico();
        l2.detalhes();
        l3.detalhes();
        l3.especifico();
        l4.detalhes();
        l4.especifico();
        
    }
}
