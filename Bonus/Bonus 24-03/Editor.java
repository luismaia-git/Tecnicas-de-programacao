

public class Editor {
    
    public static void main(String[] args) {
        //Ponto
        Ponto pont1 = new Ponto(5,9);
        

        Ponto pont2 = new Ponto(3,7);

        //Reta
        Reta ret = new Reta();
        ret.setP1(pont1);
        ret.setP2(pont2);


        System.out.printf("Distancia entre os pontos(Medida da reta): %.2f %n", (ret.getDistance()) );


        //Circulo
        Ponto pontoCentral = new Ponto(2,4);

        Circulo circ = new Circulo();
        circ.setCentro(pontoCentral);
        circ.setRaio(6);

        System.out.printf("Area do circulo: %.2f %n" , (circ.AreaCirc()));

        //Quadrado
        Ponto pontoOrigem = new Ponto(1,3);

        Quadrado quad = new Quadrado();
        quad.setOrigem(pontoOrigem);
        quad.setLado(4);

        System.out.println("Area do quadrado: " + quad.AreaQuad());
    
    }
}
