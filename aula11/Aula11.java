package cursoemvideo.cursopoo.aula11;

public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(25);
        v1.setSexo("M");
        System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setIdade(25);
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1222);
        b1.setNome("Arthur");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        System.out.println(b1.toString());
        b1.pagarMensalidade();
        Professor p1 = new Professor("Javascript");
        p1.setIdade(45);
        p1.setNome("José da Silva");
        System.out.println(p1.toString());
        p1.statusProfessor();

    }
}
