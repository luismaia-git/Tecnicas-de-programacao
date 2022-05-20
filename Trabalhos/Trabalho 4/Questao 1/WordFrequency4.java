import java.util.*;


public class WordFrequency4 {



    String palavra;

    public WordFrequency4(String palavra) {
        
        this.palavra = palavra;

    }

    public void frequenciaPalavras(String palavra){
        Map<String,Integer> repeticoes = new HashMap<String,Integer>(); 
        ArrayList<String> palavras = new ArrayList<String>();
        String[] temporario = palavra.split(" ");

        for(int i = 0; i < temporario.length ; i++  ){
            palavras.add(temporario[i]);
        }
        Collections.sort(palavras); // Sortando o arraylist antes de inseri-lo no hashmap

        for(int i = 0; i < temporario.length ; i++ ){
            int ocurrences = Collections.frequency(palavras,palavras.get(i));
            repeticoes.put(palavras.get(i),ocurrences);
        }

        repeticoes.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);


    }


    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        String wordInput = read.nextLine();

        WordFrequency4 p1 = new WordFrequency4(wordInput);
        p1.frequenciaPalavras(wordInput);

    }

}
