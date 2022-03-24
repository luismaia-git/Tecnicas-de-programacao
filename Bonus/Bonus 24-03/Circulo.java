public class Circulo {
    Ponto centro;
    float raio;
    //Ponto extremidade; 
    
    
    /*
    void setRaio() {
        Reta aux = new Reta();
        aux.setP1(centro);
        aux.setP2(extremidade);

        this.raio= aux.getDistance();
    } */
    
    
    //getters
    double getRaio(){
        return this.raio;
    }

    Ponto getCentro() {
        return this.centro;
    }

    //setters

    void setRaio(float raio) {
        this.raio = raio;
    }

    /*void setExtremidade(Ponto extr) {
        this.extremidade = extr;
    }*/

    void setCentro(Ponto entrada) {
        this.centro = entrada;
    }

    float AreaCirc() {
        float area;
        area = (float) (Math.PI * raio*raio);

        return area;
    }


}
