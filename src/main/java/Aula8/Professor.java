package Aula8;
public class Professor extends Pessoa {
    //atributos
    private String especialista;
    private float salario;
    //metodos
    public void receberaumen(float p){
    this.setSalario(this.getSalario()+p);
    }
    //metodos especiais

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String esp) {
        this.especialista = esp;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float sal) {
        this.salario = sal;
    }
    
}
