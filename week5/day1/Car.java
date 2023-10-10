package week5.day1;

public class Car extends Vehicle {

	public void ac() {
		System.out.println("its coming Car");
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.ac();
		c.breaks(3);
	}
}
