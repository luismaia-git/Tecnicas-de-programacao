import java.util.*;

public class Teste_Hash2 {

    public static void listar(Collection c){ // Item B
        System.out.println(c);
    }
    
    public static void listar2(Collection c){
        System.out.println("**** Listar 2 ****");
        for(Object o:c){
            System.out.println(o);
        }
    }

    
    public static void main(String args[]){ //Item C
        Collection<String> mesesHash=new ArrayList<>();
        
        mesesHash.add("Janeiro");
        mesesHash.add("Fevereiro");
        mesesHash.add("Março");
        mesesHash.add("Abril");
        mesesHash.add("Maio");
        mesesHash.add("Fevereiro");
        System.out.println("Hashset:");

        listar(mesesHash);
        listar2(mesesHash);
    }


    
    
}
    


    
