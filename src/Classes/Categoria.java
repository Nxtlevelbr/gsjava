package Classes;

public class Categoria {

    private String tipoAlimento;
    private int prioridade;

    public Categoria(String tipoAlimento, int prioridade){
        this.tipoAlimento = tipoAlimento;
        this.prioridade = prioridade;
    }

    public Categoria(){

    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}