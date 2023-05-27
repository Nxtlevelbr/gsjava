package Classes;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;


public class Testes {
    public static void main(String[] args){
        Fornecedor fornecedor = new Fornecedor(1, "forecedor A", "endereço A","Contato A");

        Categoria categoria = new Categoria("verduras" , "categoria A");

        Alimento alimento1 = new Alimento(1,"Alimento1", new Date(),7,10,fornecedor,categoria,5.0);

        Destinatario destinatario = new Destinatario(1,"Destinatario a", "endereço A", "a");

        List<Alimento> alimentos = new ArrayList<>();

        alimentos.add(alimento1);

        Doacao doacao = new Doacao(1, new Date(), 5, destinatario, (ArrayList<Alimento>) alimentos);

        System.out.println("ID Fornecedor: " + doacao.getId());
        System.out.println("Data doação " + doacao.getDataDoacao() );
        System.out.println("Quantidade: " + doacao.getQuantidade());
        System.out.println("Destinatario: " + doacao.getDestinatario());
        System.out.println("Alimentos para doação: ");

        for (Alimento alimento : doacao.getAlimentos()){
            System.out.println("Nome: " + alimento.getNome());
            System.out.println("valor unitario: " + alimento.getValorUnitario());
            System.out.println("-------------");
        }
    }
}
