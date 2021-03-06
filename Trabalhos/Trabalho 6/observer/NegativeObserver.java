package observer;

class NegativeObserver implements Observer{

  private ExpressionSubject subject;
  private double observerState;

  public NegativeObserver(ExpressionSubject s) {
    this.subject = s;
    this.observerState = s.getState();
    s.Attach(this);
  }

	public void print(){
		if (this.observerState <= 0){
			System.out.println("Resultado: menor ou igual a zero.");	
		}
  }
  
  public void update() {
    this.observerState = subject.getState();
  }

}
