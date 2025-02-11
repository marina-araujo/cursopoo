package cursoemvideo.cursopoo.aula04.exercitando;

public class ex01 {
    public static void main(String[] args) {
        Carro car1 = new Carro("Mitsubishi", "Eclipse Cross", 2024, "Branco");
        car1.status();
        car1.getCor();
        car1.setCor("Verde");
        car1.setVelocidadeAtual(150);
        car1.status();
        car1.acelerar(50);
        System.out.println("Velocidade após acelerar: " + car1.getVelocidadeAtual() + " km/h");
    }
}
