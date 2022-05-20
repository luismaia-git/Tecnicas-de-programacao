//Utilizarei ArrayList -> classe que extende collection, inclui valores duplicados. 
//Utilizarei HashMap 
import java.util.*;

public class CountWords{
    int total_words = 0;
    int distincts = 0;
    String word; 

    public CountWords(String word) {
        
        this.word = word;

    }
    public int getTotal() { 
        return this.total_words;
    }
    
    public int getDistintas() {
        return this.distincts;
    }
    

    public void contaPalavras(String word){
        ArrayList<String> wordList = new ArrayList<String>();
        String[] aux = word.split(" ");

        for(int i = 0; i < aux.length ; i++  ){
            wordList.add(aux[i]);
            total_words ++;
        }

        //Criando um HashMap para conseguir o numero de palavras distintas na frase.
        Map<String, Integer> counter = new HashMap<>();

        //Loopando pela minha ArrayList wordList.
        for(String wordInList: wordList ){
            if (counter.containsKey(word)){
                counter.put(wordInList, counter.get(wordInList) + 1);
            }
            else{
                counter.put(wordInList,1);
            }

        }
        distincts = counter.size();
    

    }

    public String toString() {
        return "Total de Palavras: " + this.total_words + "\nTotal de Palavras Distintas: " + this.distincts;

    }



    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        String wordInput = read.nextLine();

        CountWords p1 = new CountWords(wordInput);
        p1.contaPalavras(wordInput);

        System.out.println(p1);

    }


    
}