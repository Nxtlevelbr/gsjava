package Classes;
import Classes.Alimento;
import java.util.ArrayList;
import java.util.List;

public class Fornecedor {

    private String nome;
    private String endereco;
    private String contato;
    private List<Alimento> alimentos;

    public Fornecedor(String nome, String endereco, String contato) {
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
        this.alimentos = new ArrayList<>();
    }

    public Fornecedor(String fornecedorA, String ruaAbc) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void adicionarAlimento(Alimento alimento) {
        alimentos.add(alimento);
    }

    public double getPrecoUnitario() {
        if (!alimentos.isEmpty()) {
            double somaPrecos = 0.0;
            for (Alimento alimento : alimentos) {
                somaPrecos += alimento.getValorUnitario();
            }
            return somaPrecos / alimentos.size();
        } else {
            return 0.0; // ou algum valor padrão caso não haja alimentos cadastrados para esse fornecedor
        }
    }
}

