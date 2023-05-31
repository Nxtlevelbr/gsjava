package Classes;
import java.util.ArrayList;
import java.util.Scanner;

public class Doacao {

    private int id;
    private ArrayList<Alimento> alimentos;

    public Doacao(int id){
        this.id = id;
        alimentos = new ArrayList<Alimento>();
    }
    
    public Doacao() {
    	
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
		this.alimentos = alimentos;
	}

	public void addLote(){
        alimentos.add(novoAlim());
    }

    public Alimento novoAlim(){
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
