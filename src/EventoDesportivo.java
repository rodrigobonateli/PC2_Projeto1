import java.util.Date;

public class EventoDesportivo {
    private int codigo;
    private String nome;
    private String modalidade;
    private String local;
    private Date data;
    private Arbitro arbitro;

    public EventoDesportivo(int codigo, String nome, String modalidade, String local, Date data, Arbitro arbitro) {
        this.codigo = codigo;
        this.nome = nome;
        this.modalidade = modalidade;
        this.local = local;
        this.data = data;
        this.arbitro = arbitro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    @Override
    public String toString() {
        return "\nEventoDesportivo | " + codigo +
                " | " + nome + " | " + modalidade +
                " | " + local + " | " + data +
                " | " + arbitro.getNome();
    }
}
