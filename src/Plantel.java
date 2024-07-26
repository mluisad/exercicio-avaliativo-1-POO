
import java.util.ArrayList;

public class Plantel {
    ArrayList<Atleta> atletas;

    public Plantel(){
        atletas = new ArrayList<>();
    }

    public boolean cadastraAtleta(Atleta atleta){
        if(consultaAtleta(atleta.getNumero()) != null){
            return false;
        }
        atletas.add(atleta);
        return true;
    }

    public Atleta consultaAtleta(String nome){
        for(Atleta a : atletas){
            if(a.getNome().equals(nome)){
                return a;
            }
        }
        return null;
    }

    public Atleta consultaAtleta(int numero){
        for(Atleta a : atletas){
           if(a.getNumero() == numero){
            return a;
           } 
        }
        return null;
    }

    public void retornaAtleta(String nome){
        for(Atleta a : atletas){
            if(a.getNome().equals(nome)){
                System.out.println(a.toString());
            }
        }
    }

    public void retornaAtleta(int numero){
        for(Atleta a : atletas){
            if(a.getNumero() == numero){
                System.out.println(a.toString());
            }
        }
    }
}
