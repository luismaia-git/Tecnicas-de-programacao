public class Ponto {
    float x, y;

    Ponto () {
        this(0);
    }  
    
    Ponto (float a) {
        this(a,a);
    }

    Ponto (float x, float y) {
       this.x = x;
       this.y = y;
    }

    //getters
    float getX(){
        return this.x;
    }

    float getY(){
        return this.y;
    }

    //setters

    void setX(float x) {
        this.x = x;
    }

    void setY(float y) {
        this.y = y;
    }

}