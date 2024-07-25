import java.util.ArrayList;

public class Medalheiro {

    ArrayList<Medalha> medalha;
    
    public Medalheiro(){
        medalha = new ArrayList<>();
    }

    public boolean cadastraMedalha(Medalha m){
        if(consultaMedalha(m.getCodigo()) != null){
            return false;
        }
        medalha.add(m);
        return true;
    }   

    public Medalha consultaMedalha(int codigo){
        for(Medalha m : medalha){
            if(m.getCodigo() == codigo){
                return m;
            }
        }
        return null;
    }

    public ArrayList<Medalha> consultaMedalhas(String modalidade){
        ArrayList<Medalha> consulta = new ArrayList<>();
        for(Medalha m : medalha){
            if(m.getModalidade().equals(modalidade)){
                consulta.add(m);
            }
        }        
        return consulta;
    }
}
