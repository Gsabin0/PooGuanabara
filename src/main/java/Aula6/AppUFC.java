package Aula6;
public class AppUFC {
    public static void main(String[] args) {
        UFC l [] = new UFC[6];
        l[0] = new UFC ("Pedro","Brasil",31,1.75f,68.9f,11,2,3);
        l[1] = new UFC ("Paulo","França",21,1.65f,67.9f,14,3,0);
        l[2] = new UFC ("Vitor","Uruguai",26,1.78f,100.9f,13,2,4);
        l[3] = new UFC ("Davi","Peru",31,2.12f,98.9f,16,1,5);
        l[4] = new UFC ("Heder","China",43,1.72f,67.9f,11,1,3);
        l[5] = new UFC ("Karlos","Afica do sul",31,2.23f,120.2f,23,1,0);
         l[5].gluta();
        
        
      /* l[0].apresentar();
      
       l[0].status();
       l[1].status();
       l[2].status();
       l[3].status();
       l[4].status();
       l[5].status();*/
       
       Luta EUF1 = new Luta();
       EUF1.mluta(l[0], l[1]);
       EUF1.lutar();
       
       l[0].apresentar();
       l[1].apresentar();
    }
 
}
