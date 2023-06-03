package Classes;

public class Pagamento {
	
	private double precoTotal;
	private String titular;
	
	public Pagamento(double precoTotal, String titular) {
		this.precoTotal = precoTotal;
		this.titular = titular;
	}
	
	public double getPrecoTotal() {
		return precoTotal;
	}
	
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
}


