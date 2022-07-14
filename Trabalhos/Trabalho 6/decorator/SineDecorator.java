package decorator;

import composite.Component;

public class SineDecorator extends Decorator {

  private Component l;
  private double value;

  SineDecorator(Component l) {
    super(l);
  }

  public void operation() {
    l.operation();
    this.value = Math.sin(l.getValue());
  }
  public double getValue() {
    return this.value;
  }
}
