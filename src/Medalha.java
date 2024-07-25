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

    public int getTipo() {
        return tipo;
    }

    public boolean getIndividual(){
		if (this.individual == true){ 
			return true;
		}
		return false;
	}

    public String getModalidade() {
        return modalidade;
    }


    @Override
    public String toString() {
    return getCodigo() + "," + getTipo() + "," + getIndividual() + "," + getModalidade();
    }
}
