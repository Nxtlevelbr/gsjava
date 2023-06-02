package Classes;
import java.util.ArrayList;
import java.util.Date;

public class Processamento {
    private int idProc;
    private String produtoFinal;
    private String descricaoAlimento;
    private String tipoAlimento;
    private String capacidadeProc;
    private Date dataProduc;
    private ArrayList<Alimento> lotes;

    public Processamento(int idProc, String produtoFinal, String descricaoAlimento, String tipoAlimento, String capacidadeProc, Date dataProduc) {
        this.idProc = idProc;
        this.produtoFinal = produtoFinal;
        this.descricaoAlimento = descricaoAlimento;
        this.tipoAlimento = tipoAlimento;
        this.capacidadeProc = capacidadeProc;
        this.dataProduc = dataProduc;
        this.lotes = new ArrayList<>();
    }

    public int getIdProc() {
        return idProc;
    }

    public void setIdProc(int idProc) {
        this.idProc = idProc;
    }

    public String getProdutoFinal() {
        return produtoFinal;
    }

    public void setProdutoFinal(String produtoFinal) {
        this.produtoFinal = produtoFinal;
    }

    public String getDescricaoAlimento() {
        return descricaoAlimento;
    }

    public void setDescricaoAlimento(String descricaoAlimento) {
        this.descricaoAlimento = descricaoAlimento;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public String getCapacidadeProc() {
        return capacidadeProc;
    }

    public void setCapacidadeProc(String capacidadeProc) {
        this.capacidadeProc = capacidadeProc;
    }

    public Date getDataProduc() {
        return dataProduc;
    }

    public void setDataProduc(Date dataProduc) {
        this.dataProduc = dataProduc;
    }

    public ArrayList<Alimento> getLotes() {
        return lotes;
    }

    public void setLotes(ArrayList<Alimento> lotes) {
        this.lotes = lotes;
    }

    public void adicionarLote(Alimento alimento) {
        lotes.add(alimento);
    }
}
