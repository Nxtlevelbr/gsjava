package Classes;

public class Categoria {

    private String tipoAlimento;
    private String prioridade;

    public Categoria(String tipoAlimento, String prioridade) {
        this.tipoAlimento = tipoAlimento;
        this.prioridade = prioridade;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
}
