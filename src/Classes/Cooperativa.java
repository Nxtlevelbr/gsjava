package Classes;
import java.util.ArrayList;
import java.util.List;

public class Cooperativa {
    private List<Alimento> estoque;

    public Cooperativa(){
        estoque = new ArrayList<>();

    }
    public void venderAlimento(Alimento alimento, int quantidade) {
        if (estoque.contains(alimento)) {
            int index = estoque.indexOf(alimento);
            Alimento alimentoEstoque = estoque.get(index);
            if (alimentoEstoque.getQuantidade() >= quantidade) {
                alimentoEstoque.removerQuantidade(quantidade);
                double valorVenda = alimento.getValorUnitario() * quantidade;

                System.out.println("Venda realizada! Valor da venda: R$ " + valorVenda);
            } else {
                System.out.println("Não há quantidade suficiente do alimento no estoque.");
            }
        } else {
            System.out.println("Alimento não encontrado no estoque.");
        }
    }


}
