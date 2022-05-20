public class Main{
    public static void main(String[] args){

        
        Figura vetFigs [] = new Figura [100];
        int idFig = 0;

        //Adicionando novos quadrados ao vetor
        vetFigs[idFig++] = new Quadrado(2,3,5);
        vetFigs[idFig++] = new Quadrado(6,1,3);
        vetFigs[idFig++] = new Retangulo(8,5,9,3);
        vetFigs[idFig++] = new Retangulo(4,9,4,2);
        Ponto q1 = new Ponto(3,2); 
        vetFigs[idFig++] = new Quadrado(q1,10); //outra forma de criar o quadrado

        //Adicionando círculos ao vetor
        vetFigs[idFig++] = new Circulo(6);
        vetFigs[idFig++] = new Circulo(2);
        vetFigs[idFig++] = new Circulo(8);
        vetFigs[idFig++] = new Circulo(3);
        vetFigs[idFig++] = new Circulo(2.5f);

        
        //Imprime os valores das áreas das figuras
        for (int i = 0; i < idFig; i++){
            if(vetFigs[i] instanceof Colorida){
                System.out.print("Area[" + i + "] = " + vetFigs[i].calcularArea() + " é um ");
                vetFigs[i].desenhar();
                System.out.println(" Colorido");
            }
        }
    }
}