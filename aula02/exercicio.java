package cursoemvideo.cursopoo.aula02;

public class exercicio {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5F;
        c1.carga = 80; //deixou alterar pq ambos estão na mesma classe
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
