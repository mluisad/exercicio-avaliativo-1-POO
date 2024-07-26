import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;

public class ACMESports {
    private Scanner in = null;
    private PrintStream saidaPadrao = System.out;
    
    private Medalheiro medalheiro; 
    private Medalha medalha;
    private Plantel plantel;
    private Atleta atleta;


    public ACMESports(){
        medalheiro = new Medalheiro();
        plantel = new Plantel();
        
        try{
			BufferedReader streamEntrada = new BufferedReader(new FileReader("dadosin3.txt"));
			in = new Scanner(streamEntrada);
			PrintStream streamSaida = new PrintStream(new File("dadosout.txt"), Charset.forName("UTF-8"));
			System.setOut(streamSaida);
		} catch(Exception e){
			System.out.println(e);
		}
		Locale.setDefault(Locale.ENGLISH);
		in.useLocale(Locale.ENGLISH);
    }
    
    public void executar(){
        cadastrarAtletas();
        cadastrarMedalhas();
        cadastrarMedalhasEAtletasCorrespondentes();
    }

    private void cadastrarAtletas(){
        int numero = in.nextInt();
        while(numero != -1){
            in.nextLine();
            String nome = in.nextLine();
            String pais = in.nextLine();
            atleta = new Atleta(numero, nome, pais);
            plantel.cadastraAtleta(atleta);
            
            if(plantel.consultaAtleta(nome) != null){
                System.out.print("1:");
            }

            plantel.retornaAtleta(nome);
            numero = in.nextInt();
        }
    }  

    private void cadastrarMedalhas(){
        int codigo = in.nextInt();
        while(codigo != -1){
            in.nextLine();
            int tipo = in.nextInt();
            boolean individual = in.nextBoolean();
            in.nextLine();
            String modalidade = in.nextLine();
            medalha = new Medalha(codigo, tipo, individual, modalidade);

            if(medalheiro.consultaMedalha(codigo) == null){
                medalheiro.cadastraMedalha(medalha);
                System.out.print("2:");
                medalheiro.retornaMedalha(codigo);
            }

            codigo = in.nextInt();
        }
    }
    
    private void cadastrarMedalhasEAtletasCorrespondentes(){
        int codigo = in.nextInt();

        while(codigo != -1){
            int numero = in.nextInt();
            Atleta atleta = plantel.consultaAtleta(numero);
            Medalha medalha = medalheiro.consultaMedalha(codigo);

            if(medalheiro.consultaMedalha(codigo) != null && plantel.consultaAtleta(numero) != null){
                atleta.adicionaMedalha(medalha);
                medalha.adicionaAtleta(atleta);
                System.out.println("3:" + codigo + "," + numero);
            }
            codigo = in.nextInt();
        }
    }
}
