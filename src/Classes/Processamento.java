package Classes;
import java.util.Date;

public class Processamento {
    private int idProc;
    public String produtoFinal;
    public String descricaoAlimento;
    public String tipoAlimento;
    public String capacidadeProc;
    public Date dataProduc;

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


    }
