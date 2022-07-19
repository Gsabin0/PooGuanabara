package Aula5;
public class Controle implements Controlador {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;

    
    public Controle() {
        this.setVolume(50); 
        this.setLigado(false);
        this.setTocando(false);
    }

    private int getVolume() {
        return volume;
    }

   private void setVolume(int v) {
        this.volume = v;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }
    // metodos abstratos 

    @Override
    public void ligar() {
        this.setLigado(true);
        
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        
    }

    @Override
    public void amenu() {
        System.out.println("----MENU----");
        System.out.println("ligada? "+this.getLigado());
        System.out.println("tocando? "+this.getTocando());
        System.out.print("volume: "+this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("|");
        }
    }

    @Override
    public void fmenu() {
        System.out.println(" fechadno meuno ");
        
    }

    @Override
    public void mavolume() {
        if (this.getLigado()) {
           this.setVolume(this.getVolume()+10);
        }
    }

    @Override
    public void mevolume() {
        if (this.getLigado()) {
           this.setVolume(this.getVolume()-1);
        }
    }

    @Override
    public void lmudo() {
        if (this.getLigado() && this.getVolume()>0) {
                this.setVolume(0);
        }
    }

    @Override
    public void dmudo() {
        if (this.getLigado() && this.getVolume()==0) {
             this.setVolume(50);
        }
        
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
           this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && (this.getTocando())) {
           this.setTocando(false);
        }
        
    }
    
    
    
    
}
