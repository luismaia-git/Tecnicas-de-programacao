public class Quadrado {
    Ponto origem;
    float lado;

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


    //area
    float AreaQuad() {
        float area;
        area = (float) (lado*lado);

        return area;
    }
}
