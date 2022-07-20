package aula11;
public class AppVideo {
    public static void main(String[] args) {
        Video v[]= new Video[3];
        Gafanhoto g []= new Gafanhoto[2];
        
        v[0] = new Video("tudo sobre Got");
        v[1] = new Video("Luffy Gyer 5");
        v[2] = new Video("Como fazer pudim de doce de leite");
        
        g[0]= new Gafanhoto("Sabino",23,"M","Gsabino");
        g[1]= new Gafanhoto("Mari",20,"F","Xmari");
        
        
        
        v[0].play();
        v[0].like();
        v[0].detalhes();
        g[0].detalhes();
    }
}
