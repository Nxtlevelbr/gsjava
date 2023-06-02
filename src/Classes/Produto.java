package Classes;

import java.util.Date;

public class Produto {
    private int id;
    private String nomeProduto;
    private String descricaoProduto;
    private float valorProduto;
    private Date dataValidade;
    private Date dataProducao;

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

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
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

    public Produto(int id, String nomeProduto, String descricaoProduto, float valorProduto, Date dataValidade, Date dataProducao) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
        this.dataValidade = dataValidade;
        this.dataProducao = dataProducao;
    }
}
