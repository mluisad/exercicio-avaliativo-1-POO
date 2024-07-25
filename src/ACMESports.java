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
    private Plantel plantel;

    public ACMESports(){
        medalheiro = new Medalheiro();
        plantel = new Plantel();
        
        try{
			BufferedReader streamEntrada = new BufferedReader(new FileReader("dadosin2.txt"));
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
        System.out.println("teste");
    }
}
