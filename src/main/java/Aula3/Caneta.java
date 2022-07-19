
package Aula3;

public class Caneta {
    //variaveis
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampar;
   
    //gerar tudo com alt insert
    
    //metodo contrutor
    public Caneta(String m,String c,float p){
        
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.getTampar();
        
    }
    //tudo q vai in na tela sobre a caneta
    public void status(){
        System.out.println("----SOBRE A CANETA----");
        System.out.println("modelo: "+this.getModelo());
        System.out.println("cor: "+this.getCor());
        System.out.println("ponta: "+this.getPonta());
        System.out.println("tambada: "+this.getTampar());
    }
    //medoto get set 
    public String getModelo(){
        return this.modelo;
    } 
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
      this.cor = c;  
    }
    public void tampada(){
        this.tampar= true;
    }
    public void destampar(){
        this.tampar= false;
    }
    public boolean getTampar(){
        return this.tampar;
    }
    public void setTampar(boolean t){
        this.tampar = t;
    }
}
