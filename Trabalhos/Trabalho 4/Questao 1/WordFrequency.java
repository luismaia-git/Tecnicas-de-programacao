import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class WordFrequency {

    String texto;

    public WordFrequency(String texto) {
        
        this.texto = texto;

    }

    public void frequenciaPalavras(String texto){
        Map<String,Integer> repeticoes = new HashMap<String,Integer>(); 
        ArrayList<String> palavras = new ArrayList<String>();
        String[] temporario = texto.split(" ");

        for(int i = 0; i < temporario.length ; i++  ){
            palavras.add(temporario[i]);
        }

        for(int i = 0; i < temporario.length ; i++  ){
            int ocurrences = Collections.frequency(palavras,palavras.get(i));
            repeticoes.put(palavras.get(i),ocurrences);
        }

        repeticoes.entrySet().stream().forEach(System.out::println);
    
    }

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        String wordInput = read.nextLine();

        WordFrequency p1 = new WordFrequency(wordInput);
        p1.frequenciaPalavras(wordInput);

    }
}