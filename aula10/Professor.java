package cursoemvideo.cursopoo.aula10;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAumento(float valor) {
        this.salario += valor;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void statusProfessor() {
        System.out.println("O salário de " + getNome() + " é R$ " + getSalario());
    }
}
