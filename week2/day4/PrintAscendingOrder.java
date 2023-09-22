package week2.day4;

import java.util.Arrays;

public class PrintAscendingOrder {
public static void main(String[] args) {
	
	//Initialize the Array
	int[] number= {10,90,30,60,20,70};
	
	//out 10,20,30,60,70,90
	//to sort the values in given Array
	Arrays.sort(number);
	
	//print the values
	//System.out.println(Arrays.toString(number));
	
	//To Iterate the values from given array
	
	for (int i = 0; i < number.length; i++) {
		System.out.println(number[i]);
	}
	
}
}
