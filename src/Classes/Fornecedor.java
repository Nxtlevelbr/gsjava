package Classes;

public class Fornecedor {

    private String nome;
    private String endereco;
    private String contato;

    public Fornecedor(String nome, String endereco, String contato) {
        this.nome = nome;
        this.endereco = endereco;
        this.endereco = endereco;
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
}

