package aula11;
public class Visualizacao {
  //Atrubutos
 private Gafanhoto espectador;
 private Video filme;
 //construtor

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.setEspectador(espectador);
        this.setFilme(filme);
        this.espectador.setTotassistido(this.espectador.getTotassistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
 
 //metodos
 public void avaliar(){
     this.filme.setAvaliaçao(5);
 }
 public void avaliar(int nota){
     this.filme.setAvaliaçao(nota);
 }
 public void alaviar(float porc){
     int tot = 0;
     if (porc<=20) {
         tot=3;
     }else if(porc <=50){
       tot=5;  
     }else if(porc<=90){
        tot=8; 
     }else {
         tot=10;
     }
        this.filme.setAvaliaçao(tot);
 }
 public void detalhes(){
     System.out.println("-----------");
     System.out.println("titulo: "+this.filme.getTitulo()+"\nespectador: "+this.espectador.getNome());
 }
 //metodos especiais

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
 
}
