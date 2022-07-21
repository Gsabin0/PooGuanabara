package aula11;
public class Gafanhoto extends Pessoa{
    //atributos
    private String login;
    private int totassistido;
     //construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
       super(nome,idade,sexo);
       this.setLogin(login);
       this.setTotassistido(0);
    }
    //metodos
    public void viumaisum(){
        
    }
    @Override
    public void detalhes(){
        System.out.println("------------------");
        System.out.println("login: "+this.getLogin()+"\nassistido: "+this.getTotassistido());
        super.detalhes();
    }
    //metodos especiais

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotassistido() {
        return totassistido;
    }

    public void setTotassistido(int totassistido) {
        this.totassistido = totassistido;
    }
    
}
