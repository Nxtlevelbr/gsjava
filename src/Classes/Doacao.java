package Classes;
import java.util.Date;
import java.util.ArrayList;

public class Doacao {

    private int id;
    private Date dataDoacao;
    private int quantidade;
    private Destinatario destinatario;
    private ArrayList<Alimento> alimentos;

    public  Doacao(int id, Date dataDoacao, int quantidade, Destinatario destinatario, ArrayList<Alimento> alimentos) {
        this.id = id;
        this.dataDoacao = dataDoacao;
        this.quantidade = quantidade;
        this.destinatario = destinatario;

        if (alimentos != null) {
            this.alimentos = alimentos;
        } else {
            this.alimentos = new ArrayList<>();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(Date dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        if (alimentos != null) {
            this.alimentos = alimentos;
        } else {
            this.alimentos = new ArrayList<>();
        }
    }
}
