package cursoemvideo.cursopoo.aula11;

public class Professor extends Pessoa {
    private String curso;

    public Professor(String curso) {
        this.curso = curso;
    }

    public void statusProfessor() {
        System.out.println("Curso: " + this.curso);
        System.out.println("Nome: " + this.getNome());
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
