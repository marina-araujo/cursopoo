package cursoemvideo.cursopoo.aula12;

public class Aula12 {
    public static void main(String[] args) {
       // Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru can = new Canguru();
        Cachorro c = new Cachorro();

        can.setIdade(6);
        System.out.println("Canguru tem idade " + can.getIdade() + " anos");
        can.emitirSom();
        can.locomover();
        can.usarBolsa();
        c.emitirSom();
    }
}
