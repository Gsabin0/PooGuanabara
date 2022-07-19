package aula10;
public class Reptil extends Animal{
    //atributos
    private String corescama;
    //metodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Arrastando");
    }

    @Override
    public void alimentar() {
        System.out.println("Vegetais");
    }

    @Override
    public void som() {
        System.out.println("Som de reptil");
    }
    //metodos especiais

    public String getCorescama() {
        return corescama;
    }

    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }
    
}
