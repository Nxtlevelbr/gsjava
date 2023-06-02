package Classes;

public class Revenda {
    private int id;
    public float valorRevenda;
    public float descontoAlimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValorRevenda() {
        return valorRevenda;
    }

    public void setValorRevenda(float valorRevenda) {
        this.valorRevenda = valorRevenda;
    }

    public float getDescontoAlimento() {
        return descontoAlimento;
    }

    public void setDescontoAlimento(float descontoAlimento) {
        this.descontoAlimento = descontoAlimento;
    }

    public Revenda(float valorRevenda, float descontoAlimento) {
        this.valorRevenda = valorRevenda;
        this.descontoAlimento = descontoAlimento;
    }
    public void mostrarRevenda() {
        System.out.println("Revenda");
        System.out.println("ID: " + id);
        System.out.println("Valor de Revenda: " + valorRevenda);
        System.out.println("Desconto de Alimento: " + descontoAlimento);
        System.out.println();
    }

}
