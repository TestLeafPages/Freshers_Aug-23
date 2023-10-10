package week5.day1;

public class BMW extends Car {

	public void sunroof() {
		System.out.println("its coming from BMW");
	}
	
	public void breaks(int a) {
		System.out.println("ABS BMW" +a);
	}
	
	public static void main(String[] args) {
		BMW bmw=new BMW();
		
		bmw.ac();
		bmw.breaks(3);
		bmw.sunroof();
	}
}
