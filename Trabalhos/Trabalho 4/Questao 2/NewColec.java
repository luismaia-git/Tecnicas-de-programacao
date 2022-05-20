import java.util.*;

public class NewColec {
    Collection <String> c;

    public NewColec(Collection<String> word,String[] palavras) {
        for(String s:palavras) {
            word.add(s);
        }

        this.c=word;
    }

    void verificar(){
        if(c instanceof List){
            System.out.println("Lista: Permite a inclusao de elementos duplicados! :)");
        }
        if((c instanceof SortedSet)||(c instanceof SortedMap)){
            System.out.println("SortedSet ou SortedMap: Itens ordenados!");
        }
        if(c instanceof LinkedList){
            System.out.println("Linked list: A ordem de entrada dos elementos na coleção eh garantida!");
            
        }
    }
}