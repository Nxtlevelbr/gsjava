package Classes;

public class Pagamento {
    private int id;
    public float valorTotal;
    public float descontoTotal;

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

}
