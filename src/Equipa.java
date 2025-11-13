import java.util.ArrayList;

public class Equipa {
    private int idEquipa;
    private String nome;
    private String modalidade;
    private Treinador treinador;
    private ArrayList<Atleta> atletas = new ArrayList<>();

    public Equipa(int idEquipa, String nome, String modalidade) {
        this.idEquipa = idEquipa;
        this.nome = nome;
        this.modalidade = modalidade;
    }
    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public int getIdEquipa() {
        return idEquipa;
    }

    public void setIdEquipa(int idEquipa) {
        this.idEquipa = idEquipa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarAtleta(Atleta atleta){
        atletas.add(atleta);
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String mostrarAtletas(){
        StringBuilder sb = new StringBuilder();
        for (Atleta atleta:atletas) {
            sb.append(atleta).append("\n");
        }
        return sb.toString();
    }
    public int pesquisarAtletaPorId(int id){
        for(int i = 0; i < atletas.size(); i++){
            if(atletas.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    public Atleta obterAtleta(int index){
        return atletas.get(index);
    }

    @Override
    public String toString() {
        return "Equipa | " + idEquipa +
                " | " + nome +
                " | " + modalidade +
                (treinador != null ? " | Treinador: " + treinador.getNome() : "");
    }
}
