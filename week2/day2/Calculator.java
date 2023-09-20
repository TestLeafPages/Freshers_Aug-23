package week2.day2;

public class Calculator {

	public void add() {
 System.out.println("Addition");
	}
	private void sub() {
		System.out.println("Subraction");
	}
	protected void mul() {
		System.out.println("Multiplication");
	}
	 void div() {
		 System.out.println("Division");
	}
	 public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
		
	}
}
