package Aula6;

import java.util.Random;

public class Luta {
    //atributos
    private UFC desafiado;
    private UFC desafiante;
    private int rounds;
    private boolean aprovada;
    //metodos
    public void mluta(UFC l1, UFC l2){
        if (l1.getCategoria()==l2.getCategoria() && l1!=l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if (aprovada) {
            System.out.println("--Desafiado--");
         this.getDesafiado().apresentar();
            System.out.println("--Dsesafiante--");
         this.getDesafiante().apresentar();
         
         Random aleatorio = new Random();
         int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("Empate");
                    this.getDesafiado().eluta();
                    this.getDesafiante().eluta();
                    break;
                case 1: 
                    System.out.println("O vencedor foi "+this.getDesafiado().getNome());
                    this.getDesafiado().gluta();
                    this.getDesafiante().pluta();
                    break;
                case 2:
                    System.out.println("O vencedor foi "+this.getDesafiante().getNome());
                    this.getDesafiante().gluta();
                    this.getDesafiado().pluta();
                    break;
            }
        }else{
            System.out.println("erro! nao pode ocorrer a luta");
        }
    }
    
    
    //metodos especiais 

    public UFC getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(UFC dd) {
        this.desafiado = dd;
    }

    public UFC getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(UFC dt) {
        this.desafiante = dt;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int ro) {
        this.rounds = ro;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean ap) {
        this.aprovada = ap;
    }

    
    
}
