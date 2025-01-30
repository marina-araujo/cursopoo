package cursoemvideo.cursopoo.aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Estou tampada e não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando...");
        }
    }

    void tampar(){
        this.tampada = true;
        System.out.println("Caneta foi tampada");
    }

    void destampar(){
        this.tampada = false;
        System.out.println("Caneta foi destampada");
    }
}
