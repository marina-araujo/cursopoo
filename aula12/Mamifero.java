package cursoemvideo.cursopoo.aula12;

public class Mamifero extends Animal {
    public String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
