import java.util.ArrayList;
import java.util.Date;

public class Torneio extends EventoDesportivo{
    private ArrayList<Equipa> equipas = new ArrayList<>();
    int numRondas;
    private Equipa equipaVencedora;

    public Torneio(int codigo, String nome, String modalidade, String local, Date data, Arbitro arbitro, int numRondas) {
        super(codigo, nome, modalidade, local, data, arbitro);
        this.numRondas = numRondas;
    }

    public void adicionarEquipa(Equipa equipa){
        equipas.add(equipa);
    }

    public String mostrarEquipas(){
        StringBuilder sb = new StringBuilder();
        for(Equipa eq : equipas){
            sb.append(eq).append("\n");
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

    public int getNumRondas() {
        return numRondas;
    }

    public void setNumRondas(int numRondas) {
        this.numRondas = numRondas;
    }

    public Equipa getEquipaVencedora() {
        return equipaVencedora;
    }

    public void setEquipaVencedora(Equipa equipaVencedora) {
        this.equipaVencedora = equipaVencedora;
    }

    @Override
    public String toString() {
        return "\nTorneio | " + super.toString() +
                " | " + numRondas + (equipaVencedora != null ? " | Equipa vencedora: " + equipaVencedora.getNome() : "");
    }
}
