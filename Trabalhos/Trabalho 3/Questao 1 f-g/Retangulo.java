public class Retangulo extends Figura implements Colorida{

    String name = "Retangulo";
    String cor;
    float base, altura;
    Ponto centro;

    //Contrutores
    Retangulo(){
        this(0,0,0,0);
    }

    Retangulo(float valor, Ponto centro){
        this.base = valor;
        this.altura = valor;
        this.centro = centro;
    }

    Retangulo(float base, float altura, Ponto centro){
        this.base = base;
        this.altura = altura;
        this.centro = centro;
    }

    Retangulo(float base, float altura, float x, float y){
        this.base = base;
        this.altura = altura;
        this.centro = new Ponto(x, y);
    }

    //Métodos
    float calcularArea(){
        float area = base * altura;
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
        return "Retangulo";
    }
}
