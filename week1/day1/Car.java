package week1.day1;

public class Car {

	public void applyBreak() {
		System.out.println("Apply Break");
	}
	public void soundHorn() {
		System.out.println("soundHorn");
	}
	
	public void turnOnAC() {
		System.out.println("Turn On Ac");
	}
	public static void main(String[] args) {
		Car bmw= new Car();
		bmw.applyBreak();
		bmw.soundHorn();
		bmw.turnOnAC();
	}
	
	
}
