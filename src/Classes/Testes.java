package Classes;

public class Testes {
    public static void main(String[] args){
        Doacao doacao = new Doacao(1);
        Destinatario destinatario = new Destinatario("Del Valle");

        doacao.addLote();

        destinatario.enviarDoac(doacao);

        destinatario.mostrar();
    }
}
