package cursoemvideo.cursopoo.aula14;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected boolean experencia;

    protected void ganharExp() {

    }

    

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experencia = false;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public boolean isExperencia() {
        return experencia;
    }

    public void setExperencia(boolean experencia) {
        this.experencia = experencia;
    }



    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", Sexo=" + sexo + ", experencia=" + experencia + "]";
    }

    

    
}
