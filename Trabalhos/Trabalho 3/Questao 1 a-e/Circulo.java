public class Circulo extends Figura{
    
    float raio;
    String name;
    Ponto centro;
    
    //Construtores
    Circulo(){
        this(0);
        this.centro = new Ponto(0,0);
        this.name = "Circulo";
    }

    Circulo(float raio){
        this.raio = raio;
        this.centro = new Ponto(0,0);
        this.name = "Circulo";
    }

    Circulo(float raio, Ponto a){
        this.raio = raio;
        this.centro = a;
        this.name = "Circulo";
    }

    Circulo(float raio, float x, float y){
        this.raio = raio;
        this.centro = new Ponto(x,y);
        this.name = "Circulo";
    }

    Circulo(float x, float y){
        this(0);
        this.centro = new Ponto(x,y);
        this.name = "Circulo";
    }

    //Métodos
    float calcularArea(){
        float area = 3.14f * (this.raio * this.raio);
        return area;
    }

    void desenhar(){
        System.out.println(this.getName().toString());
    }

    
    void mover(float dx, float dy){
        this.centro.x +=dx;
        this.centro.y +=dy;
    };

    String getName(){
        return this.name;
    }

}
