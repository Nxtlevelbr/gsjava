package Classes;
import java.util.Date;

public class Alimento {

    private int id;
    private String nome;
    private Date dataRecebimento;
    private int periodoValidade;
    private int quantidade;
    private Fornecedor fornecedor;
    private Categoria categoria;

    public Alimento(int id, String nome, Date dataRecebimento, int periodoValidade, int quantidade, Fornecedor fornecedor, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.dataRecebimento = dataRecebimento;
        this.periodoValidade = periodoValidade;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public int getPeriodoValidade() {
        return periodoValidade;
    }

    public void setPeriodoValidade(int periodoValidade) {
        this.periodoValidade = periodoValidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
