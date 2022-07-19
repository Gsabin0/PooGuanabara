package Aula9;
public class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarbolsa(){
        System.out.println("renovando bolsa "+this.getNome());
    }
    @Override
     public void especifico(){
        System.out.println(" matricula:"+this.getMatri()+"\n curso: "+this.getCurso()+" bolsa de: "+this.getBolsa());
     }
    @Override
    public void pagarmen(){
        System.out.println(this.getNome()+" é bolsaista, pagamento feito");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
