package Aula9;
public abstract class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    //metodos
    public void fazermiver(){
        this.setIdade(this.getIdade()+1);
    }
      public void detalhes(){
        System.out.println("----SOBRE----");
        System.out.println(" Nome: "+this.getNome()+"\n Idade: "+this.getIdade()+"\n sexo: "+this.getSexo());
        
    }
    //metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
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

    public void setSexo(String se) {
        this.sexo = se;
    }
    
}
