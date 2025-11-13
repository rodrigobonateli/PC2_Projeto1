import java.util.ArrayList;
import java.util.Date;

public class ProvaIndividual extends EventoDesportivo{
    private ArrayList<Atleta> atletas = new ArrayList<>();
    private String classificacao;

    public ProvaIndividual(int codigo, String nome, String modalidade, String local, Date data, Arbitro arbitro) {
        super(codigo, nome, modalidade, local, data, arbitro);
    }

    public void adicionarAtleta(Atleta atleta){
        atletas.add(atleta);
    }

    public String mostrarAtletas(){
        StringBuilder sb = new StringBuilder();
        for(Atleta atleta : atletas){
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
    public int getNumTotalAtletas(){
        return atletas.size();
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
