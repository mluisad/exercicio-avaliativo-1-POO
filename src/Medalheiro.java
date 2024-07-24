import java.util.ArrayList;

public class Medalheiro {

    ArrayList<Medalha> medalha;
    
    public Medalheiro(){
        medalha = new ArrayList<>();
    }

    public boolean cadastraMedalha(Medalha m){
        return true;
    }

    public Medalha consultaMedalha(int codigo){
        Medalha m = new Medalha(0, 0, false, null);
        return m;
    }

    public ArrayList<Medalha> consultaMedalhas(String modalidade){
        ArrayList<Medalha> m = new ArrayList<>();
        return m;        
    }
}
