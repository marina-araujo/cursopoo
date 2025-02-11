package cursoemvideo.cursopoo.aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("PILOT", "Preta", 0.9f);
        /*c1.setModelo("BIC");
        // assim seria possível também já que é um atributo publico: "c1.modelo = "BIC";"
        c1.setPonta(0.5f);
        // não é possível fazer "c1.ponta = 0.6;" pq é um atributo privado
        c1.status();
        System.out.println("Tenho uma caneta "+ c1.getModelo() + " de ponta " + c1.getPonta());*/
        c1.status();
        Caneta c2 = new Caneta("PONG", "Rosa", 0.8f);
        c2.status();
    }
}
