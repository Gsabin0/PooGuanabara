
package Aula02;


public class Caneta {
    public String  modelo, cor;
    public float ponta;
    protected int carga;
    protected boolean tampada;
    
   public void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("cargas: "+ this.carga);
        System.out.println("Estado: "+ this.tampada);
    }
    public void rabiscar(){
        if (tampada==false) {
            System.out.println("erro");
        }else{
            System.out.println("pode rabiscar");
        }
    }
    protected void tampar(){
    
}
}
