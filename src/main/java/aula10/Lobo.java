package aula10;
public class Lobo extends Cachorro {
    @Override
    public void som(){
        System.out.println("auuuuuuuuuuu");
    }
    public void reagit(String frase){
        if (frase=="comida"||frase=="cheguei") {
            System.out.println("abanar e latir");
        }else{
            System.out.println("rosnar");
        }
    }
    public void reagit(int hora, int min){
        if (hora<12) {
            System.out.println("abanar");
        }else if (hora>=18) {
            System.out.println("ignorar");
        }else{
            System.out.println("abanar e latir");
        }
    }
    public void reagit(boolean dono){
        if (dono) {
            System.out.println("abanar feliz");
        }else{
            System.out.println("latir e rosnar");
        }
    }
    public void reagit(int idade, float peso){
        if (idade<=5) {
            if (peso<10) {
                System.out.println("abanar");
            }else{
                System.out.println("latir");
        }
        }else{
            if (peso<10) {
            System.out.println("rosnar");
        }else{
            System.out.println("ignorar");
        }
        }
    }
}
