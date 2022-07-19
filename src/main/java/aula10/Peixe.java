package aula10;
public class Peixe extends Animal{
    //atributos
    private String corescama;
    //metodos
    public void soltarbolha(){
        
    }
    //metodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("substancias");
    }

    @Override
    public void som() {
        System.out.println("nao tem");
    }
    //metodos especiais

    public String getCorescama() {
        return corescama;
    }

    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }
    
}
