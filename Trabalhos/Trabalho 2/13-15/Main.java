import java.util.Arrays;


public class Main{
    public static void main (String[] args){

        //Questao 13 e 14)

        Conjunto q1 = new Conjunto(Arrays.asList(0,1,2,3,4,5,6,7,8,9)); // 10 primeiros numeros naturais
        Conjunto q2 = new Conjunto(Arrays.asList(0,2,4,6,8)); // 5 primeiros pares
        Conjunto q3 = new Conjunto(Arrays.asList(1,3,5,7,9)); // 5 primeiros impares
        Conjunto q4 = new Conjunto(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));  // 10 primeiros primos

        
        System.out.println("\n======Questão 13 e 14 ======\n");
        System.out.println("4 é subconjunto de 4? " + q4.subconjunto(q4));
        
        
        System.out.println("\n");
        System.out.println("Pertinencia de 2 em 1: ");
        q1.intersecaoConjunto(q2).retornarElementos();
        System.out.println("\nPertinencia de 3 em 1: ");
        q1.intersecaoConjunto(q3).retornarElementos();
        System.out.println("\nPertinencia de 4 em 1: ");
        q1.intersecaoConjunto(q4).retornarElementos();


       
        System.out.println("\n");
        System.out.println("Conjunto 1:");
        q1.retornarElementos();
        System.out.println("\nUniao do conjunto 2 e 3");
        q2.uniaoConjunto(q3).retornarElementos();


      
        System.out.println("\n");
        System.out.println("Intersecao de 1 e 2: ");
        q1.intersecaoConjunto(q2).retornarElementos();

        
        System.out.println("\n");
        System.out.println("Diferenca entre q1 e q2: ");
        q1.diferencaConjunto(q2).retornarElementos();;
    }
        
        
}
