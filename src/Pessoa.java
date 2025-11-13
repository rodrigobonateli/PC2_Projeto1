import java.util.Date;

public class Pessoa {
    protected int id;
    protected String nome;
    protected Date dataNascimento;
    protected int contacto;
    protected String modalidade;

    public Pessoa(int id, String nome, Date dataNascimento, int contato, String modalidade) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.contacto = contato;
        this.modalidade = modalidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return id +
                " | " + nome  + " | " +
                dataNascimento.getDate() + "/" + (dataNascimento.getMonth() + 1) + "/" + (dataNascimento.getYear() + 1900)
                + " | " + contacto +
                " | " + modalidade;
    }
}
