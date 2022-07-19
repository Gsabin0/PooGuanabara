//encapsulamento
package Aula7;
public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p []= new Pessoa[2];
        Livro l []= new Livro[3];
        
        p[0]= new Pessoa("Sabino",27,"M");
        p[1]= new Pessoa("Gabi",25,"F");
        
        l[0]= new Livro("AS vantagens de ser invisivel","sabis",400,p[0]);
        l[1]= new Livro("Age","Bartolomeu",300,p[1]);
        l[2]= new Livro ("dead or alive","Oda",200,p[0]);
        
        l[0].abrir();
        l[0].folhear(234);
        
        
        l[1].abrir();
        l[1].folhear(34);
        
        l[2].abrir();
        l[2].folhear(35);
        l[2].avanpg();
        l[2].avanpg();
        
        l[0].detalhes();
        l[1].detalhes();
        l[2].detalhes();
    }
}
