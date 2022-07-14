package observer;

class PositiveObserver implements Observer{

  private ExpressionSubject subject;
  private double observerState;

  public PositiveObserver(ExpressionSubject s) {
    this.subject = s;
    this.observerState = s.getState();
    s.Attach(this);
  }

	public void print(){
		if (this.observerState > 0){
			System.out.println("Resultado: maior do que zero.");	
		}
  }
  
  public void update() {
    this.observerState = subject.getState();
  }

}
