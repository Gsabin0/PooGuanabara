package Aula9;
public class Tecnico extends Aluno {
    private String regprof;
    
    public void preatica(){
        System.out.println("O aluno "+this.getNome()+" esta no laboratorio");
    }

    public String getRegprof() {
        return regprof;
    }

    public void setRegprof(String regprof) {
        this.regprof = regprof;
    }
    
}
