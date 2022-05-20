public class Main{
    public static void main(String[] args){

        
        Figura vetFigs [] = new Figura [100];
        int idFig = 0;

        //Adicionando novos quadrados ao vetor
        vetFigs[idFig++] = new Quadrado(2,3,5);
        Ponto q1 = new Ponto(3,2); 
        vetFigs[idFig++] = new Quadrado(q1,10); //outra forma de criar o quadrado

        //Adicionando círculos ao vetor
        vetFigs[idFig++] = new Circulo(6);
        vetFigs[idFig++] = new Circulo(2.5f);

        
        //Imprime os valores das áreas das figuras
        for (int i = 0; i < idFig; i++){
            System.out.print("Area[" + i + "] = " + vetFigs[i].calcularArea() + " é um ");
            vetFigs[i].desenhar();
        }

    }
}