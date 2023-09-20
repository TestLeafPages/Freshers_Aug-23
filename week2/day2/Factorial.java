package week2.day2;

public class Factorial {
public static void main(String[] args) {
	//Factorial
	 //5 *4*3* 2*1
	// 20*3
	//60*2
	//120*1
	//120
	//initialize the temp variable as fact
	int fact=1;
	//using reverse for loop
	for (int i = 5; i >= 1; i--) {
		fact=i*fact;
		System.out.println(fact);
	}
	
	
}
}
