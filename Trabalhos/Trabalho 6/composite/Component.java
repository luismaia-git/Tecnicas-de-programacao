package composite;

public interface Component {

    void operation();

    void add(Component l);

    void remove(Component l);

    Component getChild(int index);

    double getValue();
    
}
