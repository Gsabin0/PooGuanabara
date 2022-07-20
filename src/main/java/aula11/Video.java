package aula11;
public class Video implements AcoesVideo{
    //atributos
    private String titulo;
    private int avaliaçao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    //metodos
    public void detalhes(){
        System.out.println("--VIDEO--");
        System.out.println("titulo: "+this.getTitulo()+"\navalicao: "+this.getAvaliaçao()+"\nviews: "
                +this.getViews()+"\ncurtidas: "+this.getCurtidas()+"\nreproduzindo: "+this.getReproduzindo());
    }
    //construtor
    public Video(String ti) {
        this.titulo = ti;
        this.setAvaliaçao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }
    
    //metodos especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliaçao() {
        return avaliaçao;
    }

    public void setAvaliaçao(int avaliaçao) {
        this.avaliaçao = avaliaçao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    //implementando a classe acoes video
    @Override
    public void play() {
        this.setReproduzindo(true);
        this.setViews(this.getViews()+1);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
     this.setCurtidas(this.getCurtidas()+1);
            
    }
}
