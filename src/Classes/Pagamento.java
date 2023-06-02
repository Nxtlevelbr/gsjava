package Classes;
import java.util.ArrayList;
import java.util.List;

public class Pagamento {
    private int id;
    public float valorTotal;
    public float descontoTotal;
    private List<Doacao> doacoes;
    private Processamento processamento;
    private Revenda revenda;

    public Pagamento(int id, float valorTotal, float descontoTotal) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.descontoTotal = descontoTotal;
        this.doacoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getDescontoTotal() {
        return descontoTotal;
    }

    public void setDescontoTotal(float descontoTotal) {
        this.descontoTotal = descontoTotal;
    }

    public List<Doacao> getDoacoes() {
        return doacoes;
    }
    public void adicionarDoacao(Doacao doacao) {
        doacoes.add(doacao);
    }
    public void removerDoacao(Doacao doacao) {
            doacoes.remove(doacao);
        }
    public Revenda getRevenda() {
        return revenda;
    }

    public void setRevenda(Revenda revenda) {
        this.revenda = revenda;
    }
    public void setDoacoes(List<Doacao> doacoes) {
        this.doacoes = doacoes;
    }

    public Processamento getProcessamento() {
        return processamento;
    }

    public void setProcessamento(Processamento processamento) {
        this.processamento = processamento;
    }
}


