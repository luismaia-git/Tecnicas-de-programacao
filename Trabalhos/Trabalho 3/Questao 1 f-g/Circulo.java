public class Circulo extends Figura implements Colorida{
    
    float raio;
    Ponto centro;
    String cor;
    
    //Construtores
    Circulo(){
        this(0);
        this.centro = new Ponto(0,0);
    }

    Circulo(float raio){
        this.raio = raio;
        this.centro = new Ponto(0,0);
    }

    Circulo(float raio, Ponto a){
        this.raio = raio;
        this.centro = a;
    }

    Circulo(float raio, float x, float y){
        this.raio = raio;
        this.centro = new Ponto(x,y);
    }

    Circulo(float x, float y){
        this(0);
        this.centro = new Ponto(x,y);
    }

    //Métodos
    float calcularArea(){
        float area = 3.14f * (this.raio * this.raio);
        return area;
    }

    void desenhar(){
        System.out.print(this.toString());
    }

    public void desenhar(String cor){
        this.cor = cor;
        System.out.print(this.toString());
    }


    void mover(float dx, float dy){
        this.centro.x +=dx;
        this.centro.y +=dy;
    };

    public String toString(){
        return "Circulo";
    }

}
