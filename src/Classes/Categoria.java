package Classes;

public class Categoria {

    private String tipoAlimento;
    private String prioridade;

    public Categoria(String tipoAlimento, int validade){
        this.tipoAlimento = tipoAlimento;
        if (validade > 10){
            this.prioridade = "Urgente";
        } else if(validade > 15){
            this.prioridade = "Alta";
        } else if(validade > 30) {
            this.prioridade = "Media";
        } else {
            this.prioridade = "baixa";
        }
    }

    public Categoria(){

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