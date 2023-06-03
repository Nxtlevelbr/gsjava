package Classes;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Doacao {
    private int id;
    private String doador;
    private List<String> itens;
    private Date dataValidade;

    public Doacao(int id, String doador, List<String> itens, Date dataValidade) {
        this.id = id;
        this.doador = doador;
        this.itens = itens;
        this.dataValidade = dataValidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoador() {
        return doador;
    }

    public void setDoador(String doador) {
        this.doador = doador;
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
}