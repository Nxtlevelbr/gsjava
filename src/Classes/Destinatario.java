package Classes;

import java.util.ArrayList;
import java.util.Date;

public class Destinatario {

	private String nome;
    private ArrayList<Doacao> lotesDoados;

    public Destinatario(String nome) {
    	this.nome = nome;
    	this.lotesDoados = new ArrayList<Doacao>();
    }

    public ArrayList<Doacao> getLotesDoados() {
        return lotesDoados;
    }

    public void setLotesDoados(ArrayList<Doacao> lotesDoados) {
        this.lotesDoados = lotesDoados;
    }
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void enviarDoac(Doacao doacao){
    	lotesDoados.add(doacao);
    }

	public void listarDoac(){
		for(Doacao doacao : lotesDoados){
			System.out.println(doacao.getId());
		}
	}

	public void mostrar() {
		System.out.println("Destinatario" + getNome());
		System.out.println("Lotes doados: ");
		listarDoac();
		System.out.println();
	}
	
	
}
