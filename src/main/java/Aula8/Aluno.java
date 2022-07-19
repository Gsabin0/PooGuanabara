package Aula8;
public class Aluno extends Pessoa{
    //atributos
    private boolean matri;
    private String curso;
    //construtor

    public Aluno() {
        this.setMatri(true);
    }
    
    //metodos
    public void canmatri(){
        this.setMatri(false);
    }
    //metodos especiais

    public boolean getMatri() {
        return matri;
    }

    public void setMatri(boolean matri) {
        this.matri = matri;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String cur) {
        this.curso = cur;
    }
    
}
