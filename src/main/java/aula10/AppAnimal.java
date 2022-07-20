package aula10;
public class AppAnimal {
    public static void main(String[] args) {
      Mamifero m = new Mamifero();  
      Reptil r = new Reptil();
      Ave a = new Ave();
      Peixe p = new Peixe();
      Canguru c = new Canguru();    
      Cachorro k = new Cachorro();
      Cobra b = new Cobra();
      Tartaruga t = new Tartaruga();
      Palhaço g = new Palhaço();
      Arara j = new Arara();
      Lobo l = new Lobo();
     /* m.setIdade(23);
      m.setMembros(4);
      m.setPeso(90.7f);
      m.detalhes(); */
     //mesmo metodo mas age de forma diferende em classes diferentes q foi usado POLIMORFISMO sobreposicção. Brinca um pouco com os resultados
      m.alimentar();
      m.locomover();
      m.som();
      k.som();
      //mesmo metodos agem de formas diferentes dentro da mesma classe POLIMORFISMO de sobrecarga
      l.reagit("comida");
      l.reagit(true);
      l.reagit(5,23.5f);
    }
}
