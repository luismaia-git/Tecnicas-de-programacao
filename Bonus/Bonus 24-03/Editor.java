

public class Editor {
    
    public static void main(String[] args) {
        //Ponto
        Ponto pont1 = new Ponto();
        pont1.setX(5);
        pont1.setY(9);

        Ponto pont2 = new Ponto();
        pont2.setX(3);
        pont2.setY(7);

        //Reta
        Reta ret = new Reta();
        ret.setP1(pont1);
        ret.setP2(pont2);


        System.out.printf("Distancia entre os pontos(Medida da reta): %.2f %n", (ret.getDistance()) );


        //Circulo
        Ponto pontoCentral = new Ponto();
        pontoCentral.setX(2);
        pontoCentral.setY(4);

        Circulo circ = new Circulo();
        circ.setCentro(pontoCentral);
        circ.setRaio(6);

        System.out.printf("Area do circulo: %.2f %n" , (circ.AreaCirc()));

        //Quadrado
        Ponto pontoOrigem = new Ponto();
        pontoOrigem.setX(1);
        pontoOrigem.setY(3);

        Quadrado quad = new Quadrado();
        quad.setOrigem(pontoOrigem);
        quad.setLado(4);

        System.out.println("Area do quadrado: " + quad.AreaQuad());

        

        
       


    }
}
