package Classes;
import java.util.Date;

public class Produto {
    private int id;
    public String nomeProduto;
    public String descrProd;
    public Float valorProd;
    public Date dataValidade;
    public Date dataProducao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescrProd() {
        return descrProd;
    }

    public void setDescrProd(String descrProd) {
        this.descrProd = descrProd;
    }

    public Float getValorProd() {
        return valorProd;
    }

    public void setValorProd(Float valorProd) {
        this.valorProd = valorProd;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getDataProducao() {
        return dataProducao;
    }

    public void setDataProducao(Date dataProducao) {
        this.dataProducao = dataProducao;
    }

    public Produto(int id, String nomeProduto, String descrProd, Float valorProd, Date dataValidade, Date dataProducao) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.descrProd = descrProd;
        this.valorProd = valorProd;
        this.dataValidade = dataValidade;
        this.dataProducao = dataProducao;
    }
}
