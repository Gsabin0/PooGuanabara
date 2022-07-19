package aula10;
public class Ave extends Animal {
    //atributos
    private String corpena;
    //metodos
    public void fazernimho(){
        
    }
    //metodos sobrrepostos
    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("grãos e insetos");
    }

    @Override
    public void som() {
        System.out.println("som de ave");
    }
    //metodos especiais

    public String getCorpena() {
        return corpena;
    }

    public void setCorpena(String corpena) {
        this.corpena = corpena;
    }
    
}
