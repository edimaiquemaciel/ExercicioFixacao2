

public class Titulo {
    private String nome;
    private int anoDeLancamento;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;

    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    @Override
    public String toString() {
        return "nome = " + nome +
                ", ano = " + anoDeLancamento;
    }
}
