import java.util.ArrayList;

public class Medalha {
    private int codigo;
    private int tipo;
    private boolean individual;
    private String modalidade;
    ArrayList<Atleta> atletas;

    public Medalha(int codigo, int tipo, boolean individual, String modalidade){
        this.codigo = codigo;
        this.tipo = tipo;
        this.individual = individual;
        this.modalidade = modalidade;
        atletas = new ArrayList<>();
    }

    public void adicionaAtleta(Atleta atleta){
        atletas.add(atleta);
    }

    public int getCodigo() {
        return codigo;
    }    
    
    public String getModalidade() {
        return modalidade;
    }

}
