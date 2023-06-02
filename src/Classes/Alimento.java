package Classes;

import java.util.Date;

public class Alimento {
    private int id;
    private String nome;
    private Date validade;
    private int quantidade;
    private Fornecedor fornecedor;
    private Categoria categoria;
    private double valorUnitario;

    public Alimento(int id, String nome, Date validade, int quantidade, Fornecedor fornecedor, Categoria categoria, double valorUnitario) {
        this.id = id;
        this.nome = nome;
        this.validade = validade;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.categoria = categoria;
        this.valorUnitario = valorUnitario;
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

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
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

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void removerQuantidade(int quantidade) {
        if (quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade inválida para remoção.");
        }
    }

    public double calcularValorTotal(int quantidade) {
        return valorUnitario * quantidade;
    }

    public void mostrarAlimento() {
        System.out.println("Nome: " + nome);
        System.out.println("Validade: " + validade);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Fornecedor: " + fornecedor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Valor Unitário: " + valorUnitario);
    }

    public void setTipo(String tipo) {
        categoria.setTipoAlimento(tipo);
    }
}
