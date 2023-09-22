package week2.day4;

public class FindIntersection {
public static void main(String[] args) {
	int[] number1={1,2,4,6,8,9};
	int[] number2={1,5,2,3,7,4};
	//output 1,2,4

	//To Iterate the values from number1
	for (int i = 0; i < number1.length; i++) {
		 
		//To Iterate the values from number2
		for (int j = 0; j < number2.length; j++) {
		
			//To compare both Array values
			if(number1[i]==number2[j]) {
				//print the Intersection values
				System.out.println(number1[i]);
			}
	
	}
}}
}
