package Aula6;
public class UFC {

    //atributos
private String nome;
private String Nacionalidade;
private int idade;
private float altura;
private float peso;
private String categoria;
private int vitorias;
private int derrotas;
private int empates;

    //construtor

    public UFC(String no, String Na, int id, float al, float pe, int vi, int de, int em) {
        this.setNome(no); 
        this.setNacionalidade(Na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }
    //metodos
public void apresentar() {
    System.out.println("----APRESENTACAO----");
    System.out.println("lutador: "+this.getNome());
    System.out.println("origem: "+this.getNacionalidade());
    System.out.println(this.getIdade()+" anos");
    System.out.println(this.getAltura()+"m de altura");
    System.out.println("pesando: "+this.getPeso()+"kg");
    System.out.println("ganhou:"+this.getVitorias());
    System.out.println("perdeu:"+this.getDerrotas());
    System.out.println("empatou:"+this.getEmpates());
}
public void status(){
    System.out.println("----STATUS----");
    System.out.print(this.getNome());
    System.out.println(" é peso "+this.getCategoria());
    System.out.println(this.getVitorias()+" Vit "+this.getDerrotas()+" Der "+this.getEmpates()+" Emp");
}
 
public void gluta(){
    this.setVitorias(this.getVitorias()+1);
}
public void pluta(){
    this.setDerrotas(this.getDerrotas()+1);
}
public void eluta(){
    this.setEmpates(this.getEmpates()+1);
}

//metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String Na) {
        this.Nacionalidade = Na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
       this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        
        if (this.getPeso()<52.2) {
            this.categoria = "invalido! abaixo do peso permitido";
        }else if (this.getPeso()<=70.3) {
          this.categoria = "leve";
        }else if (this.getPeso()<=83.9) {
           this.categoria = "medio";
        }else if (this.getPeso()<=120.2) {
           this.categoria = "pesado";
        }else{
            this.categoria = "invalido! acima do peso permitido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }


}
