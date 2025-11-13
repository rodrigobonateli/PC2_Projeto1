import java.util.ArrayList;
import java.util.Date;

public class Atleta extends Pessoa{
    private Equipa equipa;
    private ArrayList<Resultado> resultados = new ArrayList<>();
    public Atleta(int id, String nome, Date dataNascimento, int contato, String modalidade, Equipa equipa) {
        super(id, nome, dataNascimento, contato, modalidade);
        this.equipa = equipa;
    }
    @Override
    public String toString() {
        return "\nAtleta: " + super.toString() +
                " | " + equipa.getNome();
    }
}
