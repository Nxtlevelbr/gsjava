package Classes;

public class Testes {
    public static void main(String[] args){
        Doacao do1 = new Doacao(1);
        Destinatario de1 = new Destinatario("Del Valle");

        do1.addLote();
        de1.enviarDoac(do1);
    }
}
