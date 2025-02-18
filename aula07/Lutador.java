package cursoemvideo.cursopoo.aula07;

public class Lutador {
    // atributos:
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    // métodos:
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        nome = no;
        nacionalidade = na;
        idade = id;
        altura = al;
        setPeso(pe);
        vitorias = vi;
        derrotas = de;
        empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
        if (peso<52.2) {
            setCategoria("Inválido");
        } else if (peso<=70.3) {
            setCategoria("Leve");
        } else if (peso<=83.9) {
            setCategoria("Medio");
        } else if (peso<=120.2) {
            setCategoria("Pesado");
        } else {
            setCategoria("Inválido");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar() {
        System.out.println("Apresentando o lutador: " + this.getNome());
        System.out.println("Pesando: " + this.getPeso()  );
        System.out.println("Possui " + this.getVitorias() + " vitórias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() " empates.");
    }

    public void ganharLuta(float vitorias) {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(float derrotas) {
        this.setDerrotas(this.getDerrotas() + 1);
    }
}
