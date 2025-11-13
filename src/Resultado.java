public class Resultado {
    private int resultadoFinal;
    private double pontuacao;
    private String observacao;

    public Resultado(int resultadoFinal, double pontuacao, String observacao) {
        this.resultadoFinal = resultadoFinal;
        this.pontuacao = pontuacao;
        this.observacao = observacao;
    }

    public int getResultadoFinal() {
        return resultadoFinal;
    }

    public void setResultadoFinal(int resultadoFinal) {
        this.resultadoFinal = resultadoFinal;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
