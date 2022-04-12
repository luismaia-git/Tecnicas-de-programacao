public class Main{
    public static void main(String[] args){
        
        // Questão 1)
        System.out.println("\n----Questao 01 abaixo----\n");
        System.out.println("Alo Mundo"); // Print do Hello World
        System.out.println("==============================");
    
        // Questão 2)

        System.out.println("Main.java Compilado com sucesso");

        System.out.println("==============================");

        // Questão 3)

        System.out.println("Pessoa.java Compilado com sucesso");

        System.out.println("==============================");

        
        //Questão 4)
        Pessoa p1 = new Pessoa(); //Instanciação do objeto
        p1.setNome("Ana"); // Atribuindo o nome com o método set
        
    
        Pessoa p2 = new Pessoa();
        p2.setNome("Joao");
        

        System.out.println ("Nome da pessoa 1: "+p1.getNome());

        System.out.println ("Nome da pessoa 2: "+p2.getNome());
        
        System.out.println("==============================");
        //Questao 6
        p1.setIdade(28); // Atribuindo a idade com o método set

        p2.setIdade(18);

        System.out.println("Nome da pessoa 1: " + p1.getNome() + "\nIdade: " + p1.getIdade());
        System.out.println("Nome da pessoa 2: " + p2.getNome() + "\nIdade: " + p2.getIdade());

        //Questao 8)
        System.out.println("\n=====Questao 8=====\n");
        
        Pessoa p3 = new Pessoa("Luis", 20); // Inicialização do objeto com a passagem de parametros para o construtor


        System.out.println("Nome da pessoa 3: " + p3.getNome() + "\nIdade: " + p3.getIdade());


        
        //Questã0 9)
        System.out.println("\n=========Questao 9=========\n");

        Pessoa Pp1 = new Pessoa(); // Inicializa o novo objeto
        Pp1.setNome("Ana"); // Atribui um nome a ele

        Pessoa Pp2 = new Pessoa();
        Pp2.setNome("Joao");

        System.out.println("Antes da troca:");
        System.out.println(Pp1.getNome());
        System.out.println(Pp2.getNome());

        Pp1 = Pp2; // Sobrescreve o valor de Pp1 com o valor de Pp2

        System.out.println("Depois da troca:");
        System.out.println (Pp1.getNome());
        System.out.println (Pp2.getNome());


        //Questão 10)
        System.out.println("\n=========Questao 10=========\n");

        //Retorna os dados formatados de todos os objetos criados
        System.out.println(p1.retornar_dados());
        System.out.println(p2.retornar_dados());
        System.out.println(p3.retornar_dados());

        System.out.println(Pp1.retornar_dados());
        System.out.println(Pp2.retornar_dados());
    }
}