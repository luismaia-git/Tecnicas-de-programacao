public class Quadrado extends Figura{
    Ponto origem;
    String name;
    float lado;
    

    //Construtores

    Quadrado(Ponto origem, float lado){
        this.origem = origem;
        this.lado = lado;
        this.name = "Quadrado";
    }

    Quadrado(float x, float y, float lado){
        this.origem = new Ponto(x, y);
        this.lado = lado;
        this.name = "Quadrado";
    }

    Quadrado(float a, float lado){
        this.origem = new Ponto(a,a);
        this.lado = lado;
        this.name = "Quadrado";
    }

    //getters
    Ponto getOrigem(){
        return this.origem;
    }

    float getLado() {
        return this.lado;
    }

    //setters

    void setOrigem(Ponto origem) {
        this.origem = origem;
    }

    void setLado(float lado) {
        this.lado = lado;
    }

    

    //Métodos
    float calcularArea(){
        float area;
        area = (float) (lado*lado);

        return area;
    }

    void desenhar(){
        System.out.println(this.getName().toString());
    }
    
    void mover(float dx, float dy){
        this.origem.x +=dx;
        this.origem.y +=dy;
    };

    String getName(){
        return this.name;
    }
}
