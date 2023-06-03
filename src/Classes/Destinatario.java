package Classes;

import java.util.ArrayList;

public class Destinatario {

	private String nome;
	private ArrayList<Pagamento> lotesPagos;
    private ArrayList<Lote> lotes;

    public Destinatario(String nome) {
    	this.nome = nome;
    	this.lotes = new ArrayList<Lote>();
    	this.lotesPagos = new ArrayList<Pagamento>();
    }

    public ArrayList<Lote> getLotesDoados() {
        return lotes;
    }

    public void setLotesDoados(ArrayList<Lote> lotesDoados) {
        this.lotes = lotesDoados;
    }
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void enviarLote(Lote lote){
		if(lote.getTipo() == "Doação") {
    		lote.setPrecoTotal(0);
    	} else {
    		Pagamento pag = new Pagamento(lote.getPrecoTotal(), getNome());
    		lotesPagos.add(pag);
    	}
    	lotes.add(lote);
    }

	public void listarLotes(){
		for(Lote lote: lotes){
			System.out.println(lote.getFornecedor());
			System.out.println(lote.getTipo());
			System.out.println(lote.getAlimentos());
		}
	}

	public void mostrar() {
		System.out.println("Destinatario " + getNome());
		System.out.println("Lotes recebidos: ");
		listarLotes();
		System.out.println("");
	}
}
