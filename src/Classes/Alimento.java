package Classes;

public class Alimento {

	private int id;
    private String nome;
    private int validade;
    private int quantidade;
    private Categoria categoria;
    private double valorUnitario;
    
    public Alimento(int id, String nome, int validade, int quantidade, Categoria categoria, double valorUnitario) {
    	this.id = id;
		this.nome = nome;
		this.validade = validade;
		this.quantidade = quantidade;
		this.categoria = categoria;
		this.valorUnitario = valorUnitario;
	}

	public Alimento(){

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
	
	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
}
