
public class Reta {
    Ponto p1;
    Ponto p2;


    //getters
    Ponto getP1(){
        return this.p1;
    }

    Ponto getP2(){
        return this.p2;
    }


    //setters

    void setP1(Ponto p1) {
        this.p1 = p1;
    }

    void setP2(Ponto p2) {
        this.p2 = p2;
    }

    double getDistance() {
        double distance;
        
        distance = Math.sqrt( 
            ( (this.p2.getX() - this.p1.getX()) * (this.p2.getX() - this.p1.getX()) ) + 
            ( (this.p2.getY() - this.p1.getY()) * (this.p2.getY() - this.p1.getY()) ) 
        ) ;
        return distance;
    }

   
}
