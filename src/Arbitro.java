import java.util.Date;

public class Arbitro extends Pessoa{
    private int nivelCertificacao;

    public Arbitro(int id, String nome, Date dataNascimento, int contato, String modalidade, int nivelCertificacao) {
        super(id, nome, dataNascimento, contato, modalidade);
        this.nivelCertificacao = nivelCertificacao;
    }

    public int getNivelCertificacao() {
        return nivelCertificacao;
    }

    public void setNivelCertificacao(int nivelCertificacao) {
        this.nivelCertificacao = nivelCertificacao;
    }

    @Override
    public String toString() {
        return "\nArbitro | " + super.toString()
                + " | " + nivelCertificacao;
    }
}
