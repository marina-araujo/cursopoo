package cursoemvideo.cursopoo.aula04.exercitando;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int velocidadeAtual;

    public Carro(String ma, String mo, int a, String c) {
        this.marca = ma;
        this.modelo = mo;
        this.ano = a;
        this.cor = c;
        this.velocidadeAtual = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void status() {
        System.out.println("-------------------");
        System.out.println("INFORMAÇÕES SOBRE O CARRO: ");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Velocidade: " + this.velocidadeAtual + "km/h");
    }

    public void acelerar(int aumento) {
        this.velocidadeAtual += aumento;
    }
}
