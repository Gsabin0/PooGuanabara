package Aula4;
public class Banco {
    public int nuConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    
    
    public void estadoAtual(){
        System.out.println("----SOBRE----");
        System.out.println("conta: "+this.getNuConta());
        System.out.println("tipo: "+this.getTipo());
        System.out.println("dono: "+this.getDono());
        System.out.println("saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
     }
    
//construtor
    public void Banco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
//metodos especiais 
    public int getNuConta() {
        return nuConta;
    }

    public void setNuConta(int n) {
        this.nuConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    
    // metodos especificos
    public void aconta(String t){ 
        this.setTipo(t);
        this.setStatus(true);
        
     if (t=="cc"){
        this.setSaldo(50);
    }else if (t == "cp"){
        this.setSaldo(150);
    }
        System.out.println("Conta aberta com sucesso!!"+this.getDono());
    }
    public void fconta(){
     if (this.getSaldo()>0){
           System.out.println("erro!,saque todo o dinheiro");
     }else if (this.getSaldo()<0){
           System.out.println("erro!, vc esta em debito");    
     }else { 
           System.out.println("conta fechada");
            this.setStatus(false);
       }
       
    }
    public void depositar(float v){
     if (this.getStatus()==true){
          //saldo=saldo+v;
          this.setSaldo(this.getSaldo()+v);
          System.out.println("deposito realizado com sucesso "+this.getDono());
     }else {
          System.out.println("Erro conta nao existente!");
      }
    }
    public void sacar(float v){
    if (this.getStatus()==true){
    if (this.getSaldo()>=v) {
          //saldo= saldo-v;
          this.setSaldo(this.getSaldo()-v);
          System.out.println("saque realizado com sucesso "+ this.getDono());
   }else {
          System.out.println("saldo insuficiente!!");
      } 
   }else{
        System.out.println("conta inessitente!");
    }  
    }
    public void mensal(){
        int v = 0;
    if (this.getTipo()=="cc"){
          v=12; 
    }else if (this.getTipo()=="cp"){
            v=20;
        }
    if (this.getStatus()==true){
      if (this.getSaldo()>v) {
          //saldo= saldo-v;
          this.setSaldo(this.getSaldo()-v);
      } 
      }
    }
    
    
}
