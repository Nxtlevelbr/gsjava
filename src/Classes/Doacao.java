package Classes;
import java.util.ArrayList;

public class Doacao {

    private int id;
    private ArrayList<Alimento> alimentos;

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
        if (alimentos != null) {
            this.alimentos = alimentos;
        } else {
            this.alimentos = new ArrayList<>();
        }
    }
}
