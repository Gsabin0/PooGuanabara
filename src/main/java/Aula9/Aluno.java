package Aula9;
public class Aluno extends Pessoa {
    //atributos
    private int matri;
    private String curso;
    
    //metodos
    public void pagarmen(){
        System.out.println("men paga");
    }
    public void especifico(){
        System.out.println(" matricula:"+this.getMatri()+"\n curso: "+this.getCurso());
        
    }
    //metodos especiais

    public int getMatri() {
        return matri;
    }

    public void setMatri(int matri) {
        this.matri = matri;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String cur) {
        this.curso = cur;
    }
    
}
