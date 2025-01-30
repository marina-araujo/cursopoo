package cursoemvideo.cursopoo.aula02.projeto01;

public class projeto01 {
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina();
        d1.nome = "Algoritmos";
        d1.descricao = "Algoritmos de Java";
        d1.videoaulas = 10;
        d1.aulasvistas = 6;
        d1.estudar();
        d1.aprovar();
        d1.status();
    }
}
