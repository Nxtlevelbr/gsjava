package Classes;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Fornecedor {

    private int id;
    private String nome;
    private String endereco;
    private String contato;
    private ArrayList<Alimento> alimentos;

    public Fornecedor(int id, String nome, String endereco, String contato) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
        this.alimentos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
