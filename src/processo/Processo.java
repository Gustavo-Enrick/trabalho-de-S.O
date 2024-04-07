package processo;

public class Processo {
    //Declaração dos atributos
    private final String nome;
    private int tempoProcesso;

    //Métodos da Classe
    public Processo(String nome, int tempoProcesso) {
        this.nome = nome;
        this.tempoProcesso = tempoProcesso;
    }

    public String getNome() {
        return nome;
    }
    public int getTempoProcesso() {
        return tempoProcesso;
    }

    public void setTempoProcesso(int tempoProcesso) {
        this.tempoProcesso = tempoProcesso;
    }

    @Override
    public String toString() {
        return "processo.Processo{" +
                "nome='" + nome + '\'' +
                ", tempoProcesso=" + tempoProcesso +
                '}';
    }
}
