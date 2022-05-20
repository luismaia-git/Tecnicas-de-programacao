import java.util.*;

class Main {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        TreeSet<String> tree = new TreeSet<>();
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        ArrayList<String> array = new ArrayList<>();

        String v[] = {"a", "b", "c"};
        NewColec a = new NewColec(hs,v);
        NewColec b = new NewColec(tree,v);
        NewColec c = new NewColec(lhs,v);
        NewColec d = new NewColec(array,v);

        // HashSet nao entra em nenhum caso.
        a.verificar(); 
        b.verificar();
        // LinkedHashSet nao entra em nenhum caso.
        c.verificar(); 
        d.verificar();
    }
}