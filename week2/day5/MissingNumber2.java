  package week2.day5;

import java.util.Arrays;

public class MissingNumber2 {
public static void main(String[] args) {
	
	int[] num= {1,2,3,4,7,6,8};
	//missing element 5
	
	Arrays.sort(num);
	
	//iterate the values from given array
	for (int i = 0; i < num.length; i++) {
		//initialize trhe temp variable
		int j=i+1;
		if(num[i]!=j) {
			//1!=1
			//2!=2
			//3!=3
			//4!=4
			 //6!=5
			
			
			
			
			
			System.out.println(j);
			break;
		}
	}
	
}
}
