
import java.util.ArrayList;

public class Plantel {
    ArrayList<Atleta> atleta;

    public Plantel(){
        atleta = new ArrayList<>();
    }

    public boolean cadastraAtleta(Atleta atleta){
        return true;
    }

    public Atleta consultaAtleta(String nome){
        Atleta a = new Atleta(0, null, null);
        return a;
    }

    public Atleta consultaAtleta(int numero){
        Atleta a = new Atleta(numero, null, null);
        return a;
    }
}
