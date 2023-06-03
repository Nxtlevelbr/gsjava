package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Lote {

    private double precoTotal;
    private String tipo;
    private Fornecedor fornecedor;
    private ArrayList<Alimento> alimentos;

    public Lote(Fornecedor fornecedor, boolean doacao) {
        if (doacao) {
            this.tipo = "Doação";
        } else {
            this.tipo = "Revenda";
        }

        this.fornecedor = fornecedor;
        alimentos = new ArrayList<Alimento>();
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //esse método add um novo lote ao obj Lote, solicita ao usuário informações sobre os alimentos adicionando-os a lista.
    public void addLote() {
        Scanner strInput = new Scanner(System.in);
        String opt;
        boolean bo = true;

        while (bo) {
            alimentos.add(novoAlim());

            System.out.println("Gostaria de adicionar um novo alimento? s/n: ");
            opt = strInput.nextLine();

            if (opt.equalsIgnoreCase("s")) {
                bo = true;
            } else {
                bo = false;
            }
        }
    }

    //recebe parametros de entrada para criar um novo obj  da classe alimento e retorna este obj
    public Alimento novoAlim() {
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

        System.out.println("Quantidade(kg) do alimento a serem adicionados?: ");
        int quantidade = intInput.nextInt();

        System.out.println("Qual o valor unitário dos alimentos?: ");
        double valorUnit = dblInput.nextDouble();

        setPrecoTotal(quantidade * valorUnit);
        Alimento a1 = new Alimento(idAlim, nome, validade, quantidade, new Categoria(tipoAlim, validade), valorUnit);
        return a1;
    }

    public void adicionarAlimento(String nomeAlimento) {
        Alimento alimento = new Alimento();
        alimento.setNome(nomeAlimento);
        alimentos.add(alimento);
    }
}
