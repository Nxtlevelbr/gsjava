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
}
