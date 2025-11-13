import java.util.ArrayList;

public class AssociacaoDesportiva {

    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private ArrayList<Atleta> atletas = new ArrayList<>();
    private ArrayList<Treinador> treinadores = new ArrayList<>();
    private ArrayList<Arbitro> arbitros = new ArrayList<>();
    private ArrayList<Equipa> equipas = new ArrayList<>();


    //////////////////// PESSOAS //////////////////////////////

    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public String mostrarPessoas(){
        StringBuilder sb = new StringBuilder();
        for(Pessoa pessoa : pessoas){
            sb.append(pessoa).append("\n");
        }
        return sb.toString();
    }
    public int pesquisarPessoaPorId(int id){
        for(int i = 0; i < pessoas.size(); i++){
            if(pessoas.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    public Pessoa obterPessoa(int index){
        return pessoas.get(index);
    }
    public int getNumTotalPessoas(){
        return pessoas.size();
    }

//////////////////// ATLETAS //////////////////////////////

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

//////////////////// TREINADORES //////////////////////////////

    public void adicionarTreinador(Treinador treinador){
        pessoas.add(treinador);
    }

    public String mostrarTreinadores(){
        StringBuilder sb = new StringBuilder();
        for(Treinador treinador : treinadores){
            sb.append(treinador).append("\n");
        }
        return sb.toString();
    }
    public int pesquisarTreinadorPorId(int id){
        for(int i = 0; i < treinadores.size(); i++){
            if(treinadores.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    public Treinador obterTreinador(int index){
        return treinadores.get(index);
    }
    public int getNumTotalTreinadores(){
        return treinadores.size();
    }

//////////////////// ÁRBITROS //////////////////////////////

    public void adicionarArbitro(Arbitro arbitro){
        pessoas.add(arbitro);
    }

    public String mostrarArbitros(){
        StringBuilder sb = new StringBuilder();
        for(Arbitro arbitro : arbitros){
            sb.append(arbitro).append("\n");
        }
        return sb.toString();
    }
    public int pesquisarArbitroPorId(int id){
        for(int i = 0; i < arbitros.size(); i++){
            if(arbitros.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    public Arbitro obterArbitro(int index){
        return arbitros.get(index);
    }
    public int getNumTotalArbitros(){
        return arbitros.size();
    }
    
//////////////////// EQUIPAS //////////////////////////////

    public void adicionarEquipa(Equipa equipa){
        equipas.add(equipa);
    }

    public String mostrarEquipas(){
        StringBuilder sb = new StringBuilder();
        for(Equipa equipa : equipas){
            sb.append(equipa).append("\n");
        }
        return sb.toString();
    }
    public int pesquisarEquipaPorId(int id){
        for(int i = 0; i < equipas.size(); i++){
            if(equipas.get(i).getIdEquipa() == id){
                return i;
            }
        }
        return -1;
    }

    public Equipa obterEquipa(int index){
        return equipas.get(index);
    }
    public int getNumTotalEquipas(){
        return equipas.size();
    }

}
