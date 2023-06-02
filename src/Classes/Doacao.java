package Classes;

import java.util.Date;
import java.util.List;

public class Doacao {
    private int id;
    private String doador;
    private List<String> itens;

    public Doacao(int id, String doador, List<String> itens) {
        this.id = id;
        this.doador = doador;
        this.itens = itens;
    }

    // Mét. oper. com parâmetros e retorno
    public float calcularValorTotal(float valorUnitario, int quantidade) {
        return valorUnitario * quantidade;
    }

    // Mét. oper. com parâmetros e retorno
    public int contarItens() {
        return itens.size();
    }

    // Mét. oper. com parâmetros e retorno
    public boolean verificarValidade(Date dataValidade) {
        Date dataAtual = new Date();
        return dataValidade.after(dataAtual);
    }

    // Mét.com sobrecarga
    public void registrarDoacao(String doador) {
        this.doador = doador;
    }

    // Mét. com sobrecarga
    public void registrarDoacao(String doador, List<String> itens) {
        this.doador = doador;
        this.itens = itens;
    }

    // Mét. com sobrescrita
    @Override
    public String toString() {
        return "Doação: [id=" + id + ", doador=" + doador + ", itens=" + itens + "]";
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
}

