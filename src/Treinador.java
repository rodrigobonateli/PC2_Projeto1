import java.util.Date;

public class Treinador extends Pessoa{
    private int anosExperiencia;
    private Equipa equipa;

    public Treinador(int id, String nome, Date dataNascimento, int contato, String modalidade, int anosExperiencia, Equipa equipa) {
        super(id, nome, dataNascimento, contato, modalidade);
        this.anosExperiencia = anosExperiencia;
        this.equipa = equipa;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public Equipa getEquipa() {
        return equipa;
    }

    public void setEquipa(Equipa equipa) {
        this.equipa = equipa;
    }

    @Override
    public String toString() {
        return "\nTreinador: " + super.toString() +
                " | " + equipa.getNome() + " | " + anosExperiencia;
    }
}
