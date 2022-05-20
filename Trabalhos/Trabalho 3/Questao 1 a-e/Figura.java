public abstract class Figura extends Ponto{ // Class abstrata da figura

    abstract void desenhar();
    abstract void mover(float dx, float dy);

    abstract float calcularArea(); //Método abstrato para o cálculo da área;

   
}
