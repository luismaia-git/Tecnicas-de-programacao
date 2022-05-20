import java.util.*;

class Teste_Hash {

    public static void main (String args[]) {

        Set <String> mesesHash = new HashSet<>();

        mesesHash.add("Janeiro");
        mesesHash.add("Fevereiro");
        mesesHash.add("Marco");
        mesesHash.add("Abril");
        mesesHash.add("Maio");
        mesesHash.add("Fevereiro");

        System.out.println("HashSet : ");
        System.out.println(mesesHash);
    }
}