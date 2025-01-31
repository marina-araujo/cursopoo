package cursoemvideo.cursopoo.aula02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Estou tampada e não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando...");
        }
    }

    public void tampar(){
        this.tampada = true;
        System.out.println("Caneta foi tampada");
    }

    public void destampar(){
        this.tampada = false;
        System.out.println("Caneta foi destampada");
    }

}
