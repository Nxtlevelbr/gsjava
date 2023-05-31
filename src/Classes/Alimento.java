package Classes;

import java.util.Scanner;

public class Alimento {

    private int id;
    private String nome;
    private int validade;
    private int quantidade;
    private Fornecedor fornecedor;
    private Categoria categoria;
    private double valorUnitario;

    public Alimento(int id, String nome, int validade, int quantidade, Fornecedor fornecedor, Categoria categoria, double valorUnitario) {
        this.id = id;
        this.nome = nome;
        this.validade = validade;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.categoria = categoria;
        this.valorUnitario = valorUnitario;
    }

    public Alimento(){

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

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    public double getValorUnitario() {
		return valorUnitario;
	}

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
   
	public void removerQuantidade(int quantidade) {
        if (quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade inválida para remoção.");
        }
    }
    
    public Alimento addAlim(){
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);
        Scanner dblInput = new Scanner(System.in);

        System.out.println("Dados do alimento\n");
        System.out.println("Insira o id do alimento: ");
        int idAlim = intInput.nextInt();

        System.out.println("Qual o tipo do alimento?: ");
        String tipoAlim = strInput.nextLine();

        System.out.println("Insira o nome do alimento: ");
        String nome = strInput.nextLine();

        System.out.println("Quantos dias até a validade?: ");
        int validade = intInput.nextInt();

        System.out.println("Quantos alimentos serão adicionados?: ");
        int quantidade = intInput.nextInt();

        System.out.println("Qual o valor unitario dos alimentos?: ");
        double valorUnit = dblInput.nextDouble();

        System.out.println("Dados do fornecedor\n");

        System.out.println("Insira o nome do fornecedor: ");
        String nomeForn = strInput.nextLine();

        System.out.println("Insira o endereco do fornecedor: ");
        String endForn = strInput.nextLine();

        System.out.println("Insira o contato do fornecedor: ");
        String contForn = strInput.nextLine();

        Alimento a1 = new Alimento(idAlim, nome, validade, quantidade, new Fornecedor(nomeForn, endForn, contForn), new Categoria(tipoAlim, validade), valorUnit);
        return a1;
    }
}

