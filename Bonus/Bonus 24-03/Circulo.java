public class Circulo {
    Ponto centro;
    float raio;
    
    
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


    void setCentro(Ponto entrada) {
        this.centro = entrada;
    }

    //area
    float AreaCirc() {
        float area;
        area = (float) (Math.PI * raio*raio);

        return area;
    }


}
