package week7.day5;

public class LearnExceptionHandling2 {
public static void main(String[] args) {
	int a=10;
	int[] num= {1,2,3,4,5,6};
		try {
			System.out.println(a/0);
			
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
			
	System.out.println("Program execute successfully");
			
}
}
