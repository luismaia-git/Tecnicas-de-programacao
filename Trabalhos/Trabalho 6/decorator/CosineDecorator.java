package decorator;
import composite.Component;

public class CosineDecorator extends Decorator {
    private Component l;
    private double value;

    CosineDecorator(Component l) {
        super(l);
      }
    
      public void operation() {
        l.operation();
        this.value = Math.cos(l.getValue());
      }
      public double getValue() {
        return this.value;
      }
}
