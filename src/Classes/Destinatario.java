package Classes;

import java.util.ArrayList;
import java.util.Date;

public class Destinatario {

    private Date dataDoacao;
    private ArrayList<Doacao> lotesDoados;

    public Destinatario(Date dataDoacao, ArrayList<Doacao> lotesDoados) {
        this.dataDoacao = dataDoacao;
        this.lotesDoados = lotesDoados;
    }

    public Date getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(Date dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public ArrayList<Doacao> getLotesDoados() {
        return lotesDoados;
    }

    public void setLotesDoados(ArrayList<Doacao> lotesDoados) {
        this.lotesDoados = lotesDoados;
    }


    public void enviarDoac(Doacao doacao){
    	lotesDoados.add(doacao);
    }

}
