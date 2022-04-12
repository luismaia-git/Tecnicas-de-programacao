public class Main {
    public static void main(String[] args){
        
        //Questao 12)
        int primos[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        Conjunto q1 = new Conjunto(10); // 10 primeiros numeros naturais
        Conjunto q2 = new Conjunto(5); // 5 primeiros pares
        Conjunto q3 = new Conjunto(5); // 5 primeiros impares
        Conjunto q4 = new Conjunto(10);  // 10 primeiros primos


        for (int i = 0; i < 10; i++){
            q1.inserir_elemento(i);

            if (i % 2 == 0){
                q2.inserir_elemento(i);
            }else{
                q3.inserir_elemento(i);
            }

            q4.inserir_elemento(primos[i]);
        }

        //item A
        System.out.println("\n======Questão 12 - a)======\n");
        System.out.println("4 é subconjunto de 4? " + q4.subconjunto(q4));
        
        //item B
        System.out.println("\n======Questão 12 - b)======\n");
        System.out.println("Pertinencia de 2 em 1: ");
        q1.intersecao_conjunto(q2).retornar_conjunto();
        System.out.println("\nPertinencia de 3 em 1: ");
        q1.intersecao_conjunto(q3).retornar_conjunto();
        System.out.println("\nPertinencia de 4 em 1: ");
        q1.intersecao_conjunto(q4).retornar_conjunto();


        //item C
        System.out.println("\n======Questão 12 - c)======\n");
        System.out.println("Conjunto 1:");
        q1.retornar_conjunto();
        System.out.println("\nUniao do conjunto 2 e 3");
        q2.uniao_conjunto(q3).retornar_conjunto();


        //item D
        System.out.println("\n======Questão 12 - d)======\n");
        System.out.println("Intersecao de 1 e 2: ");
        q1.intersecao_conjunto(q2).retornar_conjunto();

        //item E
        System.out.println("\n======Questão 12 - e)======\n");
        System.out.println("Diferenca entre q1 e q2: ");
        q1.diferenca_conjunto(q2).retornar_conjunto();;
    }

}
