package Aula7;
public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    //metodos 
    public void Fazerniver(){
        this.setIdade(this.getIdade()+1);
    }
    //construtos

    public Pessoa(String n, int id, String s) {
        this.nome = n;
        this.idade = id;
        this.sexo = s;
    }
    
    // metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }
    
}
