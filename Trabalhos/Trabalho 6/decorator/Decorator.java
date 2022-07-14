package decorator;

import composite.Component;

public class Decorator implements Component  {
    
    private Component exComponent;

    public Decorator(Component l) {
        this.exComponent = l;
    }

    public void operation() {exComponent.operation();}
    public void add(Component l) {exComponent.add(l);}
    public void remove(Component l) { exComponent.remove(l);}
    public Component getChild(int index) {return exComponent.getChild(index);}
    public double getValue(){return exComponent.getValue();}
}
