public class Teste {
    String nome;
    int ano;

    public Teste( Titulo titulo) {
        this.nome = titulo.getNome();
        this.ano = titulo.getAnoDeLancamento();
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return  "nome='" + nome +
                ", ano=" + ano;
    }
}
