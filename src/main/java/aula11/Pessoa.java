package aula11;
public abstract class Pessoa {
    //atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float esperiencia;
    //metodos
    protected void ganharexp(){
        
    }
    public void detalhes(){
        System.out.println("nome: "+this.getNome()+"\nidade: "+this.getIdade()+"\nsexo: "
                +this.getSexo()+"\nesperiencia: "+this.getEsperiencia());
    }
    //construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setEsperiencia(0);
    }
    //teste
    
    //metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getEsperiencia() {
        return esperiencia;
    }

    public void setEsperiencia(float esperiencia) {
        this.esperiencia = esperiencia;
    }
    
}
