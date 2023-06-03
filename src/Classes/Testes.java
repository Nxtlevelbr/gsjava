package Classes;

public class Testes {
    public static void main(String[] args){
        Lote doacao1 = new Lote(new Fornecedor("Restaurante mitsutani", "R.Roberto Carlos", "95747-1901"), true);
        Destinatario destinatario1 = new Destinatario("Banco de alimentos Brasil");

        doacao1.addLote();

        destinatario1.enviarLote(doacao1);
        destinatario1.mostrar();
        
        Lote revenda = new Lote(new Fornecedor("Dud bolos", "R.Koto", "98343-1904"), false);
        Destinatario destinatario2 = new Destinatario("Del Valle");

        revenda.addLote();

        destinatario2.enviarLote(revenda);
        destinatario2.mostrar();
    }
}
