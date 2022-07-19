
package Aula3;
public class AppCaneta2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("bic","preta",0.45f);
        c1.status();
        Caneta c2 = new Caneta("bic", "azul", 0.55f);
        c2.status();
        /*c1.setModelo("bic cristal");
        c1.setPonta(0.54f);*/
        
        /*c1.ponta=0.54f; vai dar erro pq poonta tem um acesssso privado ou seja nao consigo altera o valor da variavel 
        diretamente, so consigo usando o set por ser um codigo dento da minha classe*/
        
        //System.out.println("tenho uma caneta "+c1.getModelo()+" da ponta "+c1.getPonta()+" da cor "+c1.getCor());
    }
    
}
