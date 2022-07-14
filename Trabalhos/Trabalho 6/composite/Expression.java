package composite;
import java.util.*;

public class Expression implements Component {

    private final Component operand1;
    private final Component operand2;
    private final String operator;
    private double value;

    ArrayList<Component> components = new ArrayList<>();
    
    public Expression(Component o1, String operator, Component o2) {
        this.operand1 = o1;
        this.operand2 = o2;
        this.operator = operator;
    }

    public void operation() {
        this.add(operand1);
        this.add(operand2);
        for (Component component : components) {
          component.operation();
        }
        if(this.operator.equals("*")) {
          this.value = operand1.getValue() * operand2.getValue();
        } else if(this.operator.equals("/")) {
          this.value = operand1.getValue() / operand2.getValue();
        } else {
          throw new UnsupportedOperationException();
        }
      }
    
    public void add(Component l) {
        components.add(l);
    }
    
    public void remove(Component l) {
        components.remove(l);
    }
      
    public Component getChild(int index) {
        return components.get(index);
    }
    
    public double getValue() {
        this.operation();
        return this.value;
    }

    
}
