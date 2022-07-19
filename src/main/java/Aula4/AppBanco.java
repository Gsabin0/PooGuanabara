
package Aula4;

public class AppBanco {
      public static void main(String[] args) {
          
        Banco p1 = new Banco();
        p1.setNuConta(1);
        p1.setDono("Sabis");
        p1.aconta("cc");
       
        
        Banco p2 = new Banco();
        p2.setNuConta(2);
        p2.setDono("Ximes");
        p2.aconta("cp");
        
        
        
        p1.depositar(300);
        p2.depositar(500);
        
         p1.sacar(34);
         p2.sacar(100);
     
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
    
}
