package aula10;
public class Mamifero extends Animal {
    //atributos
    private String corpelo;
    //metodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("mamando");
    }

    @Override
    public void som() {
        System.out.println("som de mamifero");
    }
    //metodos especiais

    public String getCorpelo() {
        return corpelo;
    }

    public void setCorpelo(String corpelo) {
        this.corpelo = corpelo;
    }
    
}
