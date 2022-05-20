import java.util.*;


public class WordFrequency2 {



    String palavra;

    public WordFrequency2(String palavra) {
        
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

        TreeMap<String, Integer> sorted = new TreeMap<>(repeticoes);

        for (Map.Entry <String, Integer> entry : sorted.entrySet()) {
            System.out.println(entry.toString());
        }

    }

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        String wordInput = read.nextLine();

        WordFrequency2 p1 = new WordFrequency2(wordInput);
        p1.frequenciaPalavras(wordInput);

    }
}
