package aula11;
public class AppVideo {
    public static void main(String[] args) {
        Video v[]= new Video[3];
        Gafanhoto g []= new Gafanhoto[2];
        Visualizacao vi []= new Visualizacao[3];
        v[0] = new Video("tudo sobre Got");
        v[1] = new Video("Luffy Gyer 5");
        v[2] = new Video("Como fazer pudim de doce de leite");
        
        g[0]= new Gafanhoto("Sabino",23,"M","Gsabino");
        g[1]= new Gafanhoto("Mari",20,"F","Xmari");
        
        vi[0]= new Visualizacao(g[0],v[1]);
        vi[1]= new Visualizacao(g[0],v[2]);
      
        v[1].play();
        vi[1].alaviar(85.3f);
        vi[0].avaliar(10);
        vi[0].detalhes();
        vi[1].detalhes();
        v[1].detalhes();
        
    }
}
