package Aula8 ;
public class Funcionario extends Pessoa {
    //atributos
    private String setor;
    private boolean trabalhando;
    //metodos
    public void mudatartraba(){
        this.trabalhando =! this.trabalhando;
    }
    //metodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String set) {
        this.setor = set;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean tra) {
        this.trabalhando = tra;
    }
    
}
