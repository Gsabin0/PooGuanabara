package Aula7;
public class Livro implements Publicaçao{
    //atributos
    private String titulo;
    private String autor;
    private int totpg;
    private int atupag;
    private boolean aberto;
    private Pessoa leitor;
    //metodos
    public void detalhes(){
        System.out.println("----SOBRE O LIVRO----");
        System.out.println("");
        System.out.println("Titulo, "+this.getTitulo()+" escrito por, "+this.getAutor());
        System.out.println("O livro pertence ao "+this.getLeitor().getNome());
        System.out.println("toal de pag: "+this.getTotpg()+" pag Atual: "+this.getAtupag());
        System.out.println("");
    }
    //construtor

    public Livro(String ti, String au, int totpg, Pessoa le) {
        this.setTitulo(ti);
        this.setAutor(au);
        this.setTotpg(totpg);
        this.setAtupag(0);
        this.setAberto(false);
        this.setLeitor(le);
    }

   
    
    //metodos especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String ti) {
        this.titulo = ti;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String au) {
        this.autor = au;
    }

    public int getTotpg() {
        return totpg;
    }

    public void setTotpg(int totpg) {
        this.totpg = totpg;
    }

    public int getAtupag() {
        return atupag;
    }

    public void setAtupag(int atupag) {
        this.atupag = atupag;
        
        
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa le) {
        this.leitor = le;
    }
//interface
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p<=this.getTotpg()&&this.getAberto()) {
            this.setAtupag(p);
        }else{
           this.setAtupag(0);

        }
            
        
        
    }

    @Override
    public void avanpg() {
       this.setAtupag(this.getAtupag()+1);
    }

    @Override
    public void voltpg() {
        this.setAtupag(this.getAtupag()-1);
    }
    
}
