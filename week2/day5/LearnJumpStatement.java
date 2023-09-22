package week2.day5;

public class LearnJumpStatement {
public static void main(String[] args) {
	
	for (int i = 1; i <=5; i++) {
		
		if(i==3) {
			System.out.println("Three");
			//continue;//To skip the current Iteration and
			//To enable the next Iteartion
			break;
		}
		System.out.println(i);
	}
}
}
