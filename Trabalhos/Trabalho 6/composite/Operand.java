package composite;

public class Operand implements Component {
    
    private double value;

    public Operand(double value){
        this.value = value;
    }

    public void operation(){}
    public void add(Component l){}
    public void remove(Component l){}
    public Component getChild(int index) {return null;}

    public double getValue() {
        return this.value;
    }

}
